package facade;

import dto.Response;
import dto.ResponseData;
import dto.request.CartRequestData;


public interface CartFacade
{
	ResponseData addToCart(CartRequestData requestData);
}
