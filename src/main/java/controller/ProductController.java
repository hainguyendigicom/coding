package controller;

import dto.B2bProduct;
import dto.ResponseData;
import dto.request.ProductRequestData;
import facade.ProductFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import service.IndexProductService;

import java.util.List;


@RestController
public class ProductController
{
	@Autowired
	private IndexProductService service;
	@Autowired
	private ProductFacade productFacade;

	@PostMapping(value = "/product")
	public ResponseData addProduct(final @RequestBody ProductRequestData productRequestData)
	{
		return productFacade.createProduct(productRequestData);
	}

	@GetMapping("/index/products")
	public List<B2bProduct> getIndexedProducts() {
		return service.getIndexedProducts();
	}
}
