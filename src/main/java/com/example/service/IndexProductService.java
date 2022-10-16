package com.example.service;

import com.example.dto.B2bProduct;
import com.example.dto.Query;
import com.example.dto.ResponseData;

import java.util.List;


public interface IndexProductService
{
	List<B2bProduct> getIndexedProducts();
}
