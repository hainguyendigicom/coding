package converter.impl;

import converter.CategoryConverter;
import dto.request.CategoryRequestData;
import entity.CategoryEntity;
import org.springframework.stereotype.Component;


@Component("CategoryConverterImpl")
public class CategoryConverterImpl implements CategoryConverter
{
	@Override
	public CategoryEntity convertDataToModel(final CategoryRequestData data)
	{
		CategoryEntity model = null;
		if (data != null)
		{
			model = new CategoryEntity();
			model.setCategoryName(data.getCategoryName());
			model.setCategoryDescription(data.getCategoryDescription());
		}
		return model;
	}
}
