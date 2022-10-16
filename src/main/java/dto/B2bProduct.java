package dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldNameConstants;

import java.util.List;


@NoArgsConstructor
@Getter
@Setter
@FieldNameConstants
public class B2bProduct
{

    @JsonProperty("id")
    private Long id;

    @JsonProperty(value = "uuid")
    private String uuid;

    @JsonProperty(value = "name")
    private String name;

    @JsonProperty(value = "description")
    private String description;

    @JsonProperty(value = "image")
    private String image;

    @JsonProperty(value = "sku")
    private String sku;

    @JsonProperty(value = "price")
    private Double price;

    @JsonProperty(value = "type")
    private int type;

    @JsonProperty(value = "categoryNames")
    List<String> categoryNames;

    @JsonProperty(value = "suggestName")
    private String suggestName;

    @JsonProperty(value = "discount")
    private Integer discount;

    @JsonProperty(value = "isBaseProduct")
    private boolean isBaseProduct;

    @JsonProperty(value = "groupNames")
    private List<String> groupNames;

    @JsonProperty(value = "defaultUOM")
    private String defaultUOM;

    @JsonProperty(value = "minPackQty")
    private Float minPackQty;

    @JsonProperty(value = "branchId")
    private String branchId;

    @JsonProperty(value = "colour")
    private String colour;

    @JsonProperty(value = "stock")
    private Boolean stock;

    @JsonProperty("imagesCollection")
    private List<String> imagesCollection;
}