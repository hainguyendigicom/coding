package facade;

import dto.Response;
import dto.ResponseData;
import dto.request.ProductRequestData;


public interface ProductFacade
{
	ResponseData createProduct(final ProductRequestData productRequestData);
}
