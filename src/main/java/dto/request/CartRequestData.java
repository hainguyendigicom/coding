package dto.request;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;


@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CartRequestData implements Serializable
{

	@JsonProperty("checkout_id")
	private String checkoutId;

	@JsonProperty("customer_id")
	private String customerId;

	@JsonProperty("shared_customer_id")
	private String sharedCustomerId;

	@JsonProperty("line_items")
	private List<CartLineItemData> lineItems;

	private String name;
	private String description;

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getSharedCustomerId() {
		return sharedCustomerId;
	}

	public void setSharedCustomerId(String sharedCustomerId) {
		this.sharedCustomerId = sharedCustomerId;
	}

	public List<CartLineItemData> getLineItems()
	{
		return lineItems;
	}

	public void setLineItems(List<CartLineItemData> lineItems)
	{
		this.lineItems = lineItems;
	}

	public String getCheckoutId()
	{
		return checkoutId;
	}

	public void setCheckoutId(String checkoutId)
	{
		this.checkoutId = checkoutId;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getDescription()
	{
		return description;
	}

	public void setDescription(String description)
	{
		this.description = description;
	}

	@Override
	public String toString()
	{
		return "CartRequestData{" + "checkoutId='" + checkoutId + '\'' + ", customerId='" + customerId + '\''
				+ ", sharedCustomerId='" + sharedCustomerId + '\'' + ", lineItems=" + lineItems + ", name='" + name + '\''
				+ ", description='" + description + '\'' + '}';
	}
}

