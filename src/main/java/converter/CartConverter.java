package converter;

import dto.request.CartLineItemData;
import dto.request.CartRequestData;
import dto.request.ProductRequestData;
import entity.CartEntity;
import entity.CustomsItemModel;
import entity.ProductEntity;

import java.util.List;


public interface CartConverter
{
	CartEntity convertDataToModel(CartRequestData cartRequestData);
	List<CustomsItemModel> convertCartLineItemDataToCartLineItemModel(List<CartLineItemData> cartLineItemDataList);
}
