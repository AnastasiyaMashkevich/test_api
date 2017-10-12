package epam.com.test.api.support.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Event {

	@JsonProperty("available")
	private Integer available;
	@JsonProperty("collectionURI")
	private String collectionURI;
	@JsonProperty("items")
	private List<Item> items = null;
	@JsonProperty("returned")
	private Integer returned;

	public Event() {

	}

	@JsonProperty("available")
	public Integer getAvailable() {
		return available;
	}

	@JsonProperty("available")
	public void setAvailable(Integer available) {
		this.available = available;
	}

	@JsonProperty("collectionURI")
	public String getCollectionURI() {
		return collectionURI;
	}

	@JsonProperty("collectionURI")
	public void setCollectionURI(String collectionURI) {
		this.collectionURI = collectionURI;
	}

	@JsonProperty("items")
	public List<Item> getItems() {
		return items;
	}

	@JsonProperty("items")
	public void setItems(List<Item> items) {
		this.items = items;
	}

	@JsonProperty("returned")
	public Integer getReturned() {
		return returned;
	}

	@JsonProperty("returned")
	public void setReturned(Integer returned) {
		this.returned = returned;
	}

	@Override public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;

		Event event = (Event) o;

		if (available != null ? !available.equals(event.available) : event.available != null)
			return false;
		if (collectionURI != null ? !collectionURI.equals(event.collectionURI) : event.collectionURI != null)
			return false;
		if (items != null ? !items.equals(event.items) : event.items != null)
			return false;
		return returned != null ? returned.equals(event.returned) : event.returned == null;
	}

	@Override public int hashCode() {
		int result = available != null ? available.hashCode() : 0;
		result = 31 * result + (collectionURI != null ? collectionURI.hashCode() : 0);
		result = 31 * result + (items != null ? items.hashCode() : 0);
		result = 31 * result + (returned != null ? returned.hashCode() : 0);
		return result;
	}

}
