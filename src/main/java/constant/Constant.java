package constant;

public class Constant
{

    public static final String SORT_ASC = "asc";
    public static final String SORT_DESC = "desc";

    public static final String CREATE_DATE = "createDate";

    public static final String SORT_DEFAULT = "createDate:desc";

    public static final String PAGE = "1";
    public static final String LIMIT = "10";

    public static final String COLON = ":";

    public static final String CATEGORY = "category";
    public static final String MAIN_IMAGE = "main_image";
    public static final String FILE = "file";

    public static final int RETURN_OK = 0;
    public static final int RETURN_NG = 2;
    public static final String RETURN_CODE = "return_code";
    public static final String MESSAGE_TEXT = "message_text";
    public static final String PERCENT_IMPORTED = "percent_imported";
    public static final String CONTEXT_ID = "contextID";
    public static final String BRANCH_ID = "branch";
    public static final String AUTHORIZATION = "Authorization";
    public static final String JOB_IMPORT_BRANCH = "importBranchJob";
    public static final String JOB_IMPORT_CUSTOMER = "importCustomerJob";
    public static final String JOB_IMPORT_SHIPTO = "importShiptoJob";
    public static final String JOB_UPDATE_SECURITY_POLICY = "updateSecurityPolicyJob";
    public static final int IMPORT_COMPLETED = 100;
    public static final String JOB_PARAMETER_TIME = "time";
    public static final int IS_DELETED = 1;
    public static final int NOT_DELETED = 0;
    public static final int IS_ACTIVE = 1;
    public static final String ID = "id";
    public static final String E_COMMERCE_VERSION = "eCommerceVersion";
    public static final int PASSWORD_CHANGE_REQUIRED_CODE = 976;
    public static final String ATTRIBUTES = "attributes";
    public static final String CUSTOMER_TYPE = "customer";
    public static final String PAGE_LIMIT = "page_limit";
    public static final String PAGE_OFFSET = "page_offset";
    public static final String ENDPOINT_NAME = "endpoint";
    public static final String PATH = "path";
    public static final String PAYMENT_SETTING ="payment_setting";
    public static final String CALL_API_DMSI ="direct:call-api-dmsi";
    public static final String CALL_API_WORLDPAY ="direct:call-api-worldpay";
    public static final String TRANSACTION_SETUP_ID = "TransactionSetupID";
    public static final String VALUE_SEARCH = "";
    public static final String CUSTOMER_GUID = "";
    public static final String CUS_SHIP_TO_GUID = "";
    public static final String FILTER_GROUP_GUID = "groupGUID";
    public static final String RESPONSE_DATA = "response_data";

    public interface MESSAGE
    {
        String EXCEPTION = "Exception when call api";
        String NOT_FOUND = "No data found";
        String SAVE_GROUP_FAIL = "Save Group to DB fail";
        String SAVE_GROUP_CATEGORY_FAIL = "Save Group_Category to DB fail";
        String SAVE_ADMIN_FAIL = "Save Admin of Group fail";
        String SAVE_GROUP_SUCCESS = "Save Customer Group success";
        String DELETE_SUCCESS = "Delete Success";
        String DELETE_FAIL = "Delete Data fail";
        String SUCCESS = "Success";
        String CAN_NOT_FOUND_GROUP = "Can not found group";
        String WRONG_ADDRESS_DATA = "Wrong address Data";
        String FETCH_FAIL = "fetch data fail";
        String LOADING_FAIL = "Data Loading Fail";
        String UPDATE_ASSIGNEE_FAIL = "Update Assignee Fail";
        String CREATE_EPADDRESS_FAIL = "Create Address fail";
        String UPDATE_SUCCESS = "Update success";
        String UPDATE_FAIL = "Update data fail";
        String GET_FAIL = "Get data fail";
        String INVALID_CONDITION = "Invalid condition. Please input again";

    }
    public static final String TYPE = "type";
    public static final String DATA = "data";

    private Constant() {
    }

    public interface TRANSACTION_STATUS {
        String PENDING = "Pending";
        String COMPLETE = "Complete";
    }
}
