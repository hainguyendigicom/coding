package converter;

import dto.ResponseData;


public interface CommonConverter
{
	ResponseData convertToResponse(Object model, boolean status, String message);
}
