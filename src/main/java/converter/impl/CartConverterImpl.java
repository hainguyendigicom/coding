package converter.impl;

import converter.CartConverter;
import dto.request.CartLineItemData;
import dto.request.CartRequestData;
import entity.CartEntity;
import entity.CustomsItemModel;
import entity.LineItemEntity;
import org.apache.commons.collections4.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import repository.CategoryRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


@Component("CartConverterImpl")
public class CartConverterImpl implements CartConverter
{
	@Override
	public CartEntity convertDataToModel(CartRequestData cartRequestData)
	{
		CartEntity cartEntity = null;
		if (Objects.nonNull(cartRequestData))
		{
			cartEntity = new CartEntity();
			cartEntity.setName(cartRequestData.getName());
			cartEntity.setCustomerId(cartRequestData.getCustomerId());
			cartEntity.setDescription(cartRequestData.getDescription());
			cartEntity.setLineItemModel(new LineItemEntity(convertCartLineItemDataToCartLineItemModel(cartRequestData.getLineItems())));
		}
		return cartEntity;
	}

	@Override
	public List<CustomsItemModel> convertCartLineItemDataToCartLineItemModel(List<CartLineItemData> cartLineItemDataList)
	{
		List<CustomsItemModel> customsItemModelList = new ArrayList<>();
		if (CollectionUtils.isNotEmpty(cartLineItemDataList))
		{
			for (CartLineItemData cartLineItemData:cartLineItemDataList)
			{
				CustomsItemModel customsItemModel = new CustomsItemModel();
				customsItemModel.setItemId(cartLineItemData.getProductId());
				customsItemModel.setItemName(cartLineItemData.getName());
				customsItemModel.setListPrice(cartLineItemData.getFixedPrice());
				customsItemModel.setQuantity(cartLineItemData.getQuantity());
				customsItemModel.setSku(cartLineItemData.getSku());
				customsItemModelList.add(customsItemModel);
			}
		}
		return customsItemModelList;
	}
}
