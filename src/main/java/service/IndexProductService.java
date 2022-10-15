package service;

import dto.B2bProduct;
import dto.Query;
import dto.ResponseData;

import java.util.List;


public interface IndexProductService
{
	List<B2bProduct> getIndexedProducts();
}
