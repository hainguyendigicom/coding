package converter;

import dto.request.CategoryRequestData;
import entity.CategoryEntity;


public interface CategoryConverter
{
	CategoryEntity convertDataToModel(CategoryRequestData productData);
}
