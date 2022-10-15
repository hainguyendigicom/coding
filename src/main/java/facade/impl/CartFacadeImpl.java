package facade.impl;

import constant.B2BCoreConstants;
import converter.CartConverter;
import converter.CommonConverter;
import dto.ResponseData;
import dto.request.CartRequestData;
import entity.CartEntity;
import facade.CartFacade;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import service.CartService;

import java.util.Objects;


@Service
public class CartFacadeImpl implements CartFacade
{
	private final Logger LOGGER = LoggerFactory.getLogger(CartFacadeImpl.class);
	@Autowired
	private CartService cartService;
	@Autowired
	private CartConverter cartConverter;
	@Autowired
	private CommonConverter commonConverter;

	@Override
	public ResponseData addToCart(final CartRequestData requestData)
	{
		String message = B2BCoreConstants.MESSAGE.SUCCESS;
		try
		{
			if (Objects.nonNull(requestData))
			{
				CartEntity cartEntity = cartConverter.convertDataToModel(requestData);
				final boolean isCreated = cartService.saveCart(cartEntity);
				if (isCreated)
				{
					return commonConverter.convertToResponse(cartEntity, true, message);
				}
			}
		}
		catch (final Exception e)
		{
			LOGGER.error("Exception when create product with error : {} ", e.getMessage());
			if (e instanceof HttpClientErrorException)
			{
				HttpClientErrorException ex = (HttpClientErrorException) e;
				return commonConverter.convertToResponse(null, false, ex.getResponseBodyAsString());

			}
		}
		return commonConverter.convertToResponse(null, false, B2BCoreConstants.MESSAGE.ADD_PRODUCT_TO_CART_FAIL);
	}

}
