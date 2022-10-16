package facade;

import dto.ResponseData;
import dto.request.CategoryRequestData;


public interface CategoryFacade
{
	ResponseData createCategory(final CategoryRequestData productRequestData);
}
