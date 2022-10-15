package service.impl;

import entity.CartEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.CartRepository;
import service.CartService;

import javax.annotation.Resource;
import java.util.Objects;


@Service("CartServiceImpl")
public class CartServiceImpl implements CartService
{
	@Resource
	CartRepository cartRepository;

	@Override
	public boolean saveCart(final CartEntity cartEntity)
	{
		if(Objects.nonNull(cartEntity)) {
			return Objects.nonNull(cartRepository.save(cartEntity));
		}
		return false;
	}
}
