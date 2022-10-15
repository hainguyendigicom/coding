package repository;

import dto.B2bProduct;
import dto.Query;
import dto.response.ProductFacetSearchResultResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IndexProductRepository
{
	public ResponseEntity<String> indexProduct(List<B2bProduct> products);

	ResponseEntity<ProductFacetSearchResultResponse> search(Query query);
}
