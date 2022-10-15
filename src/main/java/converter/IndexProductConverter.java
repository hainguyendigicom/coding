package converter;

import dto.B2bProduct;
import entity.CategoryEntity;
import entity.ProductEntity;

import java.util.List;


public interface IndexProductConverter
{
	List<B2bProduct> convertToB2bProduct(List<ProductEntity> internalProducts, List<CategoryEntity> internalCategories);

	B2bProduct convertToB2bProduct(ProductEntity internalProduct, List<CategoryEntity> internalCategories);
}
