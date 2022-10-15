package converter;

import constant.Constant;
import dto.MetaDto;
import dto.Response;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Collections;
import java.util.List;
import java.util.Objects;


public interface CommonConverter
{

    public <T1, T2> List<T2> convertEntityToResponseDto(final List<T1> entities, final Class<T2> responseDto);

    public <T1, T2> T2 convertRequestToEntity(T1 request, Class<T2> entity);

    default Response convertToResponse(final Object data, final int returnCode, final String message, String... title) {
        final Response response = new Response();
        response.setData(data);
        response.setMessage(message);
        response.setStatus(returnCode == Constant.RETURN_OK);
        response.setReturnCode(returnCode);
        if (Objects.nonNull(title) && title.length > 0) {
            response.setTitle(title[0]);
        }
        return response;
    }

    default Response convertToResponse(final Object data, final boolean status, final String message) {
        final Response response = new Response();
        response.setData(data);
        response.setMessage(message);
        response.setStatus(status);
        return response;
    }

    default Response convertResponsePaging(final Page<?> page, final boolean status, final String message) {
        final Response response = new Response();
        MetaDto meta = null;
        if (page != null) {
            meta = new MetaDto();
            meta.setLimit(page.getSize());
            meta.setPage(page.getNumber() + 1);
            meta.setTotalPage(page.getTotalPages());
            meta.setTotalRecords(page.getTotalElements());
            response.setData(page.getContent());
        } else {
            response.setData(Collections.emptyList());
        }
        response.setMeta(meta);
        response.setMessage(message);
        response.setStatus(status);

        response.setReturnCode(status ? Constant.RETURN_OK : Constant.RETURN_NG);
        return response;
    }

    default Response convertResponsePaging(@NotBlank final List<?> content, final Pageable pageable, final long total, final boolean status,
                                           final String message) {
        final Response response = new Response();
        MetaDto meta = null;
        if (pageable != null) {
            meta = new MetaDto();
            meta.setLimit(pageable.getPageSize());
            meta.setPage(pageable.getPageNumber() + 1);
            final long totalPage = total % pageable.getPageSize();
            meta.setTotalPage(totalPage > 0 ? total / pageable.getPageSize() + 1 : total / pageable.getPageSize());
            meta.setTotalRecords(total);
            response.setData(content);
        }
        response.setMeta(meta);
        response.setMessage(message);
        response.setStatus(status);

        return response;
    }

    default Sort convertToSort(@NotNull final String sort) {
        final String[] strs = sort.split(Constant.COLON);
        Sort sortBy = null;
        if (strs.length > 0) {
            if (strs[1].equals(Constant.SORT_ASC)) {
                sortBy = Sort.by(strs[0]).ascending();
            } else {
                sortBy = Sort.by(strs[0]).descending();
            }
        }
        return sortBy;
    }
}
