package dto.request;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import dto.ProductData;
import lombok.Getter;
import lombok.Setter;


@JsonInclude(value = Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@Getter
@Setter
public class ProductRequestData extends ProductData
{
    /**
     * 
     */
    private static final long serialVersionUID = -4806334519886048057L;

    @JsonProperty("size")
    private String size;

    @JsonProperty("ecommerce_description")
    private String eCommerceDescription;

    @JsonProperty("configurable")
    private boolean configurable;

    @JsonProperty("display_complementary_items")
    private boolean displayComplementaryItems;

    @JsonProperty("stock")
    private boolean stock;

    @JsonProperty("discontinued")
    private String discontinued;

    @JsonProperty("allow_r_main_pv")
    private boolean allowRMAinPV;

    @JsonProperty("stocking_uom")
    private String stockingUOM;

    @JsonProperty("min_pack_qty")
    private Float minPackQty;

    @JsonProperty("min_pack_uom")
    private String minPackUOM;

    @JsonProperty("branch_id")
    private String branchId;

    @JsonProperty("extended_description")
    private String extendedDescription;

    @JsonProperty("item_code")
    private String itemCode;

    @JsonProperty("item_type")
    private String itemType;

    @JsonProperty("product_group_major_guid")
    private String productGroupMajorGuid;

    @JsonProperty("product_group_minor_guid")
    private String productGroupMinorGuid;

    private String uom;

    private String defaultUOM;

    @JsonProperty("colour")
    private String colour;
}
