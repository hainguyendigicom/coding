package facade.impl;

import constant.B2BCoreConstants;
import converter.CommonConverter;
import converter.ProductConverter;
import dto.ResponseData;
import dto.request.ProductRequestData;
import entity.ProductEntity;
import facade.ProductFacade;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import service.ProductService;

import javax.transaction.Transactional;


@Service
public class ProductFacadeImpl implements ProductFacade
{
	@Autowired
	private ProductService productService;
	@Autowired
	private ProductConverter productConverter;
	@Autowired
	private CommonConverter commonConverter;
	private final Logger LOGGER = LoggerFactory.getLogger(ProductFacadeImpl.class);

	@Override
	@Transactional
	public ResponseData createProduct(final ProductRequestData productRequestData)
	{
		ProductEntity model = null;
		String message = B2BCoreConstants.MESSAGE.SUCCESS;
		try
		{
			if (productRequestData != null)
			{
				model = productConverter.convertDataToModel(productRequestData);
				final boolean isCreated = productService.saveOrUpdate(model);
				if (isCreated)
				{
					return commonConverter.convertToResponse(model, true, message);
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
		return commonConverter.convertToResponse(null, false, B2BCoreConstants.MESSAGE.CREATE_FAIL);
	}

}
