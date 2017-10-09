package epam.com.test.api.support.model;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import java.util.List;

@JsonDeserialize(as = Event.class)
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

}
