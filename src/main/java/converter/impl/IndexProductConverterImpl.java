package converter.impl;

import converter.IndexProductConverter;
import dto.B2bProduct;
import entity.CategoryEntity;
import entity.ProductEntity;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


@Component
public class IndexProductConverterImpl implements IndexProductConverter
{
	private static final Logger LOGGER = LoggerFactory.getLogger(IndexProductConverterImpl.class);

	@Override
	public List<B2bProduct> convertToB2bProduct(final List<ProductEntity> productEntities,
			final List<CategoryEntity> categoryEntities)
	{
		final List<B2bProduct> products = new ArrayList<>();
		if (CollectionUtils.isNotEmpty(productEntities))
		{
			for (ProductEntity internalProduct : productEntities)
			{
				try
				{
					products.add(convertToB2bProduct(internalProduct, categoryEntities));
				}
				catch (Exception e)
				{
					LOGGER.error("Error while indexing", e);
				}
			}
		}
		return products;
	}

	@Override
	public B2bProduct convertToB2bProduct(final ProductEntity productEntity, final List<CategoryEntity> categoryEntities)
	{
		final B2bProduct product = new B2bProduct();
		if (null != productEntity)
		{
			if (StringUtils.isNotBlank(productEntity.getSku()))
			{
				product.setId((long) productEntity.getProductCode());
				product.setDescription(productEntity.getProductDescription());
				product.setImage(productEntity.getProductImageUrl());
				product.setName(productEntity.getProductName());
				product.setSku(productEntity.getSku());
				product.setType(productEntity.getProductType());
				product.setSuggestName(productEntity.getProductName());
				product.setDiscount(productEntity.getDiscount());
				product.setBaseProduct(productEntity.isBaseProduct());
				product.setMinPackQty(productEntity.getMinPackQty());
				product.setBranchId(productEntity.getBranchId());
				product.setStock(productEntity.isStock());
				product.setPrice(productEntity.getProductPrice());
				product.setCategoryNames(productEntity.getCategories());
			}
		}
		return product;
	}
}