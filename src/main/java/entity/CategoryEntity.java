package entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;


@Entity
@Data
@Table(name = "category")
@IdClass(CategoryId.class)
public class CategoryEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "branch_id", length = 50)
    private String branchId;

    @Id
    @Column(name = "category_id")
    private String categoryId;

    @Column(name = "parent_id")
    private Integer categoryParentId;

    @Column(name = "name")
    private String categoryName;

    @Column(name = "description")
    private String categoryDescription;

    @Column(name = "custom_url")
    private String customUrl;

    @Column(name = "default_product_sort")
    private String defaultProductSort;

    @Column(name = "is_visible")
    private boolean isVisible;

    @Column(name = "page_title")
    private String pageTitle;

    @Column(name = "sort_order")
    private Integer sortOrder;

    @Column(name = "is_deleted")
    private boolean isDeleted;

    @Column(name = "catalog_uuid")
    private String catalogUuid;

    @Column(name = "slug")
    private String slug;

    @Column(name = "status")
    private String status;

    @Column(name = "image_url")
    private String imageUrl;

    @Column(name = "created_at")
    private Timestamp createdAt;

    @Column(name = "updated_at")
    private Timestamp updatedAt;

    @Override
    public String toString()
    {
        return "CategoryEntity{" + "branchId='" + branchId + '\'' + ", categoryId='" + categoryId + '\'' + ", categoryParentId="
              + categoryParentId + ", categoryName='" + categoryName + '\'' + ", categoryDescription='" + categoryDescription
              + '\'' + ", customUrl='" + customUrl + '\'' + ", defaultProductSort='" + defaultProductSort + '\'' + ", isVisible="
              + isVisible + ", pageTitle='" + pageTitle + '\'' + ", sortOrder=" + sortOrder + ", isDeleted=" + isDeleted
              + ", catalogUuid='" + catalogUuid + '\'' + ", slug='" + slug + '\'' + ", status='" + status + '\'' + ", imageUrl='"
              + imageUrl + '\'' + ", createdAt=" + createdAt + ", updatedAt=" + updatedAt + '}';
    }

}
