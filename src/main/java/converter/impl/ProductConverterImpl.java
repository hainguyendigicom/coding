package converter.impl;

import constant.B2BCoreConstants;
import constant.Constant;
import converter.ProductConverter;
import converter.exception.B2bConvertDataType;
import dto.ResponseData;
import dto.request.ProductRequestData;
import entity.ProductEntity;
import org.springframework.stereotype.Component;


@Component("ProductConverterImpl")
public class ProductConverterImpl implements ProductConverter
{
	@Override
	public ProductEntity convertDataToModel(final ProductRequestData data)
	{
		ProductEntity model = null;
		if (data != null)
		{
			model = new ProductEntity();
			model.setBaseProduct(false);
			model.setCategories(B2bConvertDataType.convertListToString(data.getCategories()));
			model.setCost(data.getCost());
			model.setDeleted(false);
			model.setDiscount(data.getDiscount());
			model.setFixedPrice(data.getFixedPrice());
			model.setProductDescription(data.getProductDescription());
			model.setProductName(data.getProductName());
			model.setProductType(B2BCoreConstants.PRODUCT_TYPE.NORMAL);
			model.setProductPrice(data.getProductPrice());
			model.setProductImageUrl(data.getMainImageUrl());
			model.setSku(data.getSku());
			model.setProductCode(Integer.parseInt(data.getProductCode()));
			model.setBranchId(data.getBranchId());
			model.setColour(data.getColour());
		}
		return model;
	}

	@Override
	public ResponseData convertToResponse(final Object model, final boolean status, final String message)
	{
		final ResponseData data = new ResponseData();
		data.setResult(model);
		if (model == null)
		{
			data.setMessage(Constant.MESSAGE.UPDATE_FAIL);
			data.setDescription(message);
			data.setSuccess(false);
		}
		else
		{
			data.setMessage(Constant.MESSAGE.UPDATE_SUCCESS);
			data.setDescription(message);
			data.setSuccess(true);
		}
		return data;
	}
}
