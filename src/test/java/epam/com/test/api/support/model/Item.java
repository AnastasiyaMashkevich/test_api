package epam.com.test.api.support.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Item {

	@JsonProperty("resourceURI")
	private String resourceURI;
	@JsonProperty("name")
	private String name;
	@JsonProperty("type")
	private String type;

	public Item() {

	}

	@JsonProperty("resourceURI")
	public String getResourceURI() {
		return resourceURI;
	}

	@JsonProperty("resourceURI")
	public void setResourceURI(String resourceURI) {
		this.resourceURI = resourceURI;
	}

	@JsonProperty("name")
	public String getName() {
		return name;
	}

	@JsonProperty("name")
	public void setName(String name) {
		this.name = name;
	}
	@JsonProperty("type")
	public String getType() {
		return type;
	}

	@JsonProperty("type")
	public void setType(String type) {
		this.type = type;
	}

	@Override public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;

		Item item = (Item) o;

		if (resourceURI != null ? !resourceURI.equals(item.resourceURI) : item.resourceURI != null)
			return false;
		if (name != null ? !name.equals(item.name) : item.name != null)
			return false;
		return type != null ? type.equals(item.type) : item.type == null;
	}

	@Override public int hashCode() {
		int result = resourceURI != null ? resourceURI.hashCode() : 0;
		result = 31 * result + (name != null ? name.hashCode() : 0);
		result = 31 * result + (type != null ? type.hashCode() : 0);
		return result;
	}

}
