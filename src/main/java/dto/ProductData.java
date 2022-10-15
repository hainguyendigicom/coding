package dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;


@JsonIgnoreProperties(ignoreUnknown = true)
@lombok.Data
public class ProductData implements Serializable
{
	private static final long serialVersionUID = 1L;

	@JsonProperty("id")
	private String productCode;

	@JsonProperty("name")
	private String productName;

	@JsonProperty("price")
	private double productPrice;

	@JsonProperty("description")
	private String productDescription;

	@JsonProperty("image_url")
	private String mainImageUrl;

	@JsonProperty("sku")
	private String sku;

	@JsonProperty("categories")
	private List<String> categories;

	@JsonProperty("cost")
	private double cost;

	@JsonProperty("product_base_id")
	private String productBaseId;

	@JsonProperty("product_types")
	private int productType;

	@JsonProperty("product_period")
	private int productPeriod;

	@JsonProperty("is_base_product")
	private boolean isBaseProduct;

	@JsonProperty("periods")
	private List<ProductData> periods;

	private String from;

	private String to;


	private boolean isSubscription;
	private boolean isTransitProduct;
	private boolean isQuoteTransitProduct;
	private boolean isQuoteHousingProduct;

	@JsonProperty("min_price")
	private double minPrice;

	@JsonProperty("max_price")
	private double maxPrice;

	@JsonProperty("period")
	private String period;

	private int discount;

	@JsonProperty("fixed_price")
	private double fixedPrice;

	@JsonProperty("type")
	private Integer type;

	@JsonProperty("variation_products")
	private List<ProductData> variationProducts;

	@JsonProperty("category_names")
	private List<String> categoryNames;

	@JsonProperty("is_upgrade")
	private int isUpgrade;

	@JsonIgnore
	private String productUuid;

	@JsonProperty("period_type")
	private String periodType;

    @JsonProperty("size")
    private String size;

    @JsonProperty("ecommerce_description")
    private String eCommerceDescription;

    @JsonProperty("configurable")
    private Boolean configurable;

    @JsonProperty("display_complementary_items")
    private Boolean displayComplementaryItems;

    @JsonProperty("stock")
    private Boolean stock;

    @JsonProperty("discontinued")
    private String discontinued;

    @JsonProperty("allow_r_main_pv")
    private Boolean allowRMAinPV;

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

	@JsonProperty("product_variation_option_id")
	private String productVariationOptionId;

	private String uom;

	@JsonProperty("default_uom")
	private String defaultUOM;

	@Override
	public String toString()
	{
		return "ProductData{" + "productCode='" + productCode + '\'' + ", productName='" + productName + '\'' + ", productPrice="
				+ productPrice + ", productDescription='" + productDescription + '\'' + ", mainImageUrl='" + mainImageUrl + '\''
				+ ", sku='" + sku + '\'' + ", categories=" + categories + ", cost=" + cost + ", productBaseId='" + productBaseId
				+ '\'' + ", productType=" + productType + ", productPeriod=" + productPeriod + ", isBaseProduct=" + isBaseProduct
				+ ", periods=" + periods + ", from='" + from + '\'' + ", to='" + to + '\'' + ", isSubscription=" + isSubscription
				+ ", isTransitProduct=" + isTransitProduct + ", isQuoteTransitProduct=" + isQuoteTransitProduct
				+ ", isQuoteHousingProduct=" + isQuoteHousingProduct + ", minPrice=" + minPrice + ", maxPrice=" + maxPrice
				+ ", period='" + period + '\'' + ", discount=" + discount + ", fixedPrice=" + fixedPrice + ", type=" + type
				+ ", variationProducts=" + variationProducts + ", categoryNames=" + categoryNames + ", isUpgrade=" + isUpgrade
				+ ", productUuid='" + productUuid + '\'' + ", periodType='" + periodType + '\'' + ", size='" + size + '\''
				+ ", eCommerceDescription='" + eCommerceDescription + '\'' + ", configurable=" + configurable
				+ ", displayComplementaryItems=" + displayComplementaryItems + ", stock=" + stock + ", discontinued='" + discontinued
				+ '\'' + ", allowRMAinPV=" + allowRMAinPV + ", stockingUOM='" + stockingUOM + '\'' + ", minPackQty=" + minPackQty
				+ ", minPackUOM='" + minPackUOM + '\'' + ", branchId='" + branchId + '\'' + ", extendedDescription='"
				+ extendedDescription + '\'' + ", productVariationOptionId='" + productVariationOptionId + '\'' + ", uom='" + uom
				+ '\'' + ", defaultUOM='" + defaultUOM + '\'' + '}';
	}

}
