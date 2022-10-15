package converter;

import dto.ResponseData;
import dto.request.ProductRequestData;
import entity.ProductEntity;

public interface ProductConverter
{
	ProductEntity convertDataToModel(ProductRequestData productData);
}
