package service.impl;

import converter.IndexProductConverter;
import dto.B2bProduct;
import entity.CategoryEntity;
import entity.ProductEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.CategoryRepository;
import repository.ProductRepository;
import service.IndexProductService;

import java.util.List;


@Service
public class IndexProductServiceImpl implements IndexProductService
{
	@Autowired
	private IndexProductConverter converter;
	@Autowired
	private ProductRepository productRepository;
	@Autowired
	private CategoryRepository categoryRepository;
	@Override
	public List<B2bProduct> getIndexedProducts() {
		final List<ProductEntity> products = productRepository.findAllByIsDeleted(false);
		final List<CategoryEntity> categories = categoryRepository.findAllByIsDeleted(false);

		return converter.convertToB2bProduct(products, categories);
	}

}
