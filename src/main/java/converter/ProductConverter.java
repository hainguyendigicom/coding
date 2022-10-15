package converter;

import dto.ResponseData;
import dto.request.ProductRequestData;
import entity.ProductEntity;

public interface ProductConverter
{
	public ProductEntity convertDataToModel(ProductRequestData productData);
	public ResponseData convertToResponse(Object model, boolean status, String message);
}
