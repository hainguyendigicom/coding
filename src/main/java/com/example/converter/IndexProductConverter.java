package com.example.converter;

import com.example.dto.B2bProduct;
import com.example.entity.CategoryEntity;
import com.example.entity.ProductEntity;

import java.util.List;


public interface IndexProductConverter
{
	List<B2bProduct> convertToB2bProduct(List<ProductEntity> internalProducts, List<CategoryEntity> internalCategories);

	B2bProduct convertToB2bProduct(ProductEntity internalProduct, List<CategoryEntity> internalCategories);
}
