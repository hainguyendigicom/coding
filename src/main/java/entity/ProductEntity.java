package entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;


@Entity
@Table(name = "product")
@Getter
@Setter
public class ProductEntity extends CommonEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_code")
    private int productCode;

    @Column(name = "product_name")
    private String productName;

    @Column(name = "product_price")
    private Double productPrice;

    @Column(name = "product_description", length = 3000)
    private String productDescription;

    @Column(name = "product_image")
    private String productImageUrl;

    @Column(name = "product_sku")
    private String sku;

    @Column(name = "product_categories")
    @Lob
    private String categories;

    @Column(name = "product_cost")
    private Double cost;

    @Column(name = "product_base_id")
    private String productBaseId;

    @Column(name = "product_type")
    private int productType;

    @Column(name = "product_period")
    private Integer productPeriod;

    @Column(name = "is_base_product")
    private boolean isBaseProduct;

    @Column(updatable = false, name = "product_discount")
    private Integer discount;

    @Column(updatable = false, name = "product_fixed_price")
    private Double fixedPrice;

    @Column(name = "size")
    private String size;

    @Column(name = "stock")
    private boolean stock;

    @Column(name = "discontinued")
    private String discontinued;

    @Column(name = "stocking_uom")
    private String stockingUOM;

    @Column(name = "min_pack_qty")
    private Float minPackQty;

    @Column(name = "min_pack_uom")
    private String minPackUOM;

    @Column(name = "branch_id")
    private String branchId;

    @Column(name = "item_code")
    private String itemCode;

    @Column(name = "item_type")
    private String itemType;

    @Column(name = "colour")
    private String colour;
}
