package controller;


import dto.ResponseData;
import dto.request.CartRequestData;
import facade.CartFacade;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@CrossOrigin
public class CartController
{
    private final Logger logger = LoggerFactory.getLogger(CartController.class);

	@Autowired
	CartFacade cartFacade;

	@PostMapping(value = "/add-to-cart")
	public ResponseData modifyCart(@RequestBody final CartRequestData requestCartData)
	{
		return cartFacade.addToCart(requestCartData);
	}
}
