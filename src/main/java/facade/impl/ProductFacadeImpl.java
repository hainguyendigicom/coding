package facade.impl;

import constant.B2BCoreConstants;
import converter.CommonConverter;
import converter.ProductConverter;
import dto.ProductData;
import dto.ResponseData;
import dto.request.ProductRequestData;
import entity.ProductEntity;
import facade.ProductFacade;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.data.domain.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import service.ProductService;

import javax.transaction.Transactional;
import java.util.List;


@Service
public class ProductFacadeImpl implements ProductFacade
{
	@Autowired
	private ProductService productService;
	@Autowired
	private ProductConverter productConverter;
	private final Logger LOGGER = LoggerFactory.getLogger(ProductFacadeImpl.class);

	@Override
	@Transactional
	public ResponseData createProduct(final ProductRequestData productRequestData)
	{
		ProductEntity model = null;
		ProductData productData = null;
		String message = B2BCoreConstants.MESSAGE.SUCCESS;
		try
		{
			if (productRequestData != null)
			{
				model = productConverter.convertDataToModel(productRequestData);
				final boolean isCreated = productService.saveOrUpdate(model);
				if (isCreated)
				{
					return productConverter.convertToResponse(model, true, message);
				}
			}
			LOGGER.info("productData: {} ", productData.toString());
		}
		catch (final Exception e)
		{
			LOGGER.error("Exception when create product with error : {} ", e.getMessage());
			message = e.getMessage();
			if (e instanceof HttpClientErrorException)
			{
				HttpClientErrorException ex = (HttpClientErrorException) e;
				return productConverter.convertToResponse(null, false, ex.getResponseBodyAsString());

			}
		}
		return productConverter.convertToResponse(null, false, B2BCoreConstants.MESSAGE.CREATE_FAIL);
	}

}
