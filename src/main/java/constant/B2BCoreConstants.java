package constant;

import org.springframework.stereotype.Component;


@Component
public final class B2BCoreConstants
{

	public interface QUERY
	{
		String SYMBOL = "?";
		String EQUAL_SYMBOL = "=";
		String AND_SYMBOL = "&";
		String SLASH_SYMBOL = "/";
		int LIMIT_DEFAULT = 25;
		int OFFSET_DEFAULT = 0;
		String PAGE_LIMIT = "page[limit]=";
		String PAGE_OFFSET = "page[offset]=";
	}

	public interface QUOTE
	{
		String STATUS_INITIALIZATION = "In-Initialization";
		String STATUS_OFFERED = "Offered";
		String STATUS_REQUESTED = "Requested";
		String STATUS_SUBMITTED = "Submitted";
		String STATUS_CANCELLED = "Cancelled";
		String STATUS_OFFER_CANCELLED = "Offer Cancelled";
		String STATUS_REJECTED = "Rejected";
		String STATUS_APPROVED = "Approved";
		String STATUS_ORDERED = "Ordered";
		String STATUS_PENDING_APPROVED = "Pending Approved";
	}

	public interface CART
	{
		Integer STATUS_INVALID = 0;
		Integer STATUS_SHOPPING = 1;
		Integer STATUS_SAVED = 2;
		Integer STATUS_PLACE_ORDER = 3;
		Integer STATUS_QUOTE_SUBMIT = 4;
		Integer STATUS_PLACE_ORDER_IN_BO = 5;

		String DEFAULT_SHIPPING_COST_ITEM = "Shipping Cost";
		String DEFAULT_SHIPPING_COST_SKU = "shipping-cost";
		String CART_DEFAULT_NAME = "New Cart";
		String CHEAT_IMAGE = "https://s3-eu-west-1.amazonaws.com/bkt-svc-files-cmty-api-moltin-com/33131f67-457e-4b10-9b67-99e46a77e9f6/8e616e19-d8c1-468d-9297-a4f487cc6f59.tmp";
		String DATE_FORMAT = "yyyy-MM-dd";
		String PROMOTION_FOR_CART = "Promotion for cart ";
		String PROMOTION_CODE_PREFIX = "DIGI-";
		String PROMOTION_CODES = "promotion_codes";
		int FORMAT_PRICE = 10000;
		int ROUNDING_VALUE = 100;

		String TYPE_CART_ITEM = "cart_item";
		String TYPE_CUSTOM_ITEM = "custom_item";
	}

	public interface PRODUCT_TYPE
	{
		int INVALID = 0;
		int NORMAL = 1;
		int SUBSCRIPTION = 2;
		int TRANSIT_PRODUCT = 3;
		int QUOTE_TRANSIT_PRODUCT = 4;
		int QUOTE_HOUSING_PRODUCT = 5;
		int WEAPON_PRODUCT = 6;
		int BUNDLE_PRODUCT = 7;
		int SCHEDULE_PRODUCT = 8;
		int JAMF_PRODUCT = 9;
		int PHYSICAL = 10;
		int DIGITAL = 11;
		int VARIATION_PRODUCT = 12;
		int JOURNEY_PRODUCT = 13;
		int BUNDLE_JOURNEY_PRODUCT = 14;
		int BUNDLE_WATCH = 15; // Watch Bundle
	}

	public interface CUSTOMER_TYPE
	{
		int ANONYMOUS = 0;
		int ADMIN_OF_HEADQUARTER = 1;
		int MEMBER_OF_HEADQUARTER = 2;
		int ADMIN_OF_SUB_GROUP = 3;
		int MEMBER_OF_SUB_GROUP = 4;
	}

	public interface RESPONSE_ERROR
	{
		String LIMITED_BUDGET = "Over Limit Budget or Out of date budget";
		String NOT_ALLOW_PERMISSION = "DO NOT HAVE PERMISSION";
		String BAD_REQUEST = "BAD REQUEST";
	}

	public interface MESSAGE
	{

		String SUCCESS = "Success";

		String NOT_FOUND_USER = "Not found user";

		String EXCEPTION = "Exception when call api";

		String UPDATE_DATA_FAIL = "Update Data fail";

		String CAN_NOT_FOUND_GROUP = "Can not find customer group";

		String INVALID_USER = "Invalid user";

		String NOT_FOUND = "Not Found Data";

		String CREATE_FAIL = "Created fail";

		String B2B_ERROR = "Save to B2B fail";

		String SAVE_ERROR = "Create Address fail";

		String DELETE_FAIL = "Delete fail";

		String FETCH_FAIL = "Fetch Data from BC fail";

		String LOGIN_ERROR = "Username or Password Is Incorrect";

		String ACCOUNT_DISABLE = "Your Account Is Disabled";

		String ACCOUNT_DISABLE_SF = "Your Account Cannot Login To Storefront";

		String ACCOUNT_DISABLE_BO = "Your Account Cannot Login To Sales Ref";

		String INTERNAL_ERROR = "Internal Error";

		String SHARED_SAVED_CART_FAIL = "Share Saved Cart Fail";

		String SHARED_SAVED_CART_NOT_EXIST = "Saved Cart Does Not Exist";

		String ADD_PRODUCT_TO_CART_FAIL = "Add product to cart fail";
	}

	public interface CUSTOMER_ROLE
	{
		String ANONYMOUS = "ANONYMOUS";
		String ADMIN_OF_HEADQUARTER = "AOHQ";
		String MEMBER_OF_HEADQUARTER = "MOHQ";
		String ADMIN_OF_SUB_GROUP = "AOSG";
		String MEMBER_OF_SUB_GROUP = "MOSG";
	}

	public interface GROUP_TYPE
	{
		int HEADQUARTER = 0;
	}

	public interface ORDER_TYPE
	{
		int NORMAL_ORDER = 1;
		int QUOTE_ORDER = 2;
	}

	public interface PERMISSIONS
	{
		String PLACE_ORDER = "PLACE ORDER";
		String ORDER_OVER_MAX_ORDER_VALUE = "ORDER FOR OVER MAX ORDER VALUE";
		String SUBMIT_QUOTE = "SUBMIT QUOTE";
		String ORDER_OVER_BUDGET_ORDER_VALUE = "ORDER FOR OVER BUDGET ORDER VALUE";
		String ORDER_OVER_BUDGET_QUOTE_VALUE = "ORDER FOR OVER BUDGET QUOTE VALUE";
		String ORDER_OVER_MAX_QUOTE_VALUE = "ORDER FOR OVER MAX QUOTE VALUE";
		String ASSIGN_QUOTE = "ASSIGN QUOTE";
	}

	// constants for name of property
	public interface NAME_PROPERTIES
	{
		String PRICELIST_ID = "priceListId";
		String CUSTOMER_ID = "customerId";
		String DEFAULT_ADDRESS_ID = "isDefault";
		String FIRST_NAME = "firstName";
		String LAST_NAME = "lastName";
		String COMPANY = "company";
		String ADDRESS1 = "address1";
		String ADDRESS2 = "address2";
		String STATE_OR_PROVINCE = "stateOrProvince";
		String POSTAL_CODE = "postalCode";
		String PHONE = "phone";
		String ADDRESS_TYPE = "addressType";
		String COUNTRY = "country";
		String CITY = "city";
		String COUNTRY_CODE = "countryCode";
		String IS_DELETED = "isDeleted";
		String GROUP_ID = "groupId";
		String ADDRESS_ID = "addressId";
		String COUNTRY_ID = "countryId";
		String STATE_ABBREVIATION = "stateAbbreviation";
		String STREET1 = "address1";
		String STREET2 = "address2";
		String PRODUCT_ID = "productId";
	}

	public interface DELIMITERS
	{
		String COMMA = ",";
		String UNDERLINE = "_";
		String DASH = "-";
	}

	public interface PROMOTIONS
	{
		String PROMOTION_PREFIX_NAME = "Promotion for cart ";
		String PROMOTION_PREFIX_SKU = "DIGI-";
	}

	public interface PERMISSION
	{
		String VIEW_CATEGORY = "view_category";
		String EDIT_CATEGORY = "edit_category";
		String DELETE_CATEGORY = "delete_category";
		String APPROVAL_CATEGORY = "approval_category";
		String VIEW_PRODUCT = "view_product";
		String EDIT_PRODUCT = "edit_product";
		String DELETE_PRODUCT = "delete_product";
		String APPROVAL_PRODUCT = "approval_product";
		String VIEW_USER = "view_user";
		String EDIT_USER = "edit_user";
		String DELETE_USER = "delete_user";
		String APPROVAL_USER = "approval_user";
		String VIEW_GROUP = "view_group";
		String EDIT_GROUP = "edit_group";
		String DELETE_GROUP = "delete_group";
		String APPROVAL_GROUP = "approval_group";
		String VIEW_PRICE_LIST = "view_price_list";
		String EDIT_PRICE_LIST = "edit_price_list";
		String DELETE_PRICE_LIST = "delete_price_list";
		String APPROVAL_PRICE_LIST = "approval_price_list";
		String VIEW_QUOTE = "view_quote";
		String EDIT_QUOTE = "edit_quote";
		String DELETE_QUOTE = "delete_quote";
		String APPROVAL_QUOTE = "approval_quote";
		String VIEW_ORDER = "view_order";
		String EDIT_ORDER = "edit_order";
		String DELETE_ORDER = "delete_order";
		String APPROVAL_ORDER = "approval_order";
		String VIEW_ACCOUNT_HIERARCHY = "view_account_hierarchy";
		String EDIT_ACCOUNT_HIERARCHY = "edit_account_hierarchy";
		String DELETE_ACCOUNT_HIERARCHY = "delete_account_hierarchy";
		String APPROVAL_ACCOUNT_HIERARCHY = "approval_account_hierarchy";
	}

	public interface PaymentMethod
	{
		int PO = 1;
		int CREDIT_CART = 2;
		String PO_STATUS = "Awaiting Payment";
		String CREDIT_CART_STATUS = "Processing";
	}

	public interface TYPE_MODEL
	{
		String CUSTOMER_TYPE = "customer";
	}

	public interface WEEK
	{
		int CURRENT_WEEK = 0;
		int LAST_WEEK = 1;
	}

	public interface ORDER_STATUS
	{
		String CANCELLED = "Cancelled";
		String DONE = "done";
	}

	public interface OBJECT_TYPE
	{
		String ORDER = "ORDER";
		String QUOTE = "QUOTE";
		String CHECKOUT_OUT = "CHECKOUT";
	}
}
