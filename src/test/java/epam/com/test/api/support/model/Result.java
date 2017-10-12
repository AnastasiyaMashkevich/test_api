package epam.com.test.api.support.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonIgnore;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Result {
	@JsonProperty("id")
	private Integer id;
	@JsonProperty("name")
	private String name;
	@JsonProperty("description")
	private String description;
	@JsonProperty("modified")
	private String modified;
	@JsonProperty("resourceURI")
	private String resourceURI;
	@JsonProperty("event")
	private Event event;
	@JsonProperty("series")
	private Event series;
	@JsonProperty("stories")
	private Event stories;
	@JsonProperty("events")
	private Event events;

	public Result() {

	}

	@JsonProperty("id")
	public Integer getId() {
		return id;
	}

	@JsonProperty("id")
	public void setId(Integer id) {
		this.id = id;
	}

	@JsonProperty("name")
	public String getName() {
		return name;
	}

	@JsonProperty("name")
	public void setName(String name) {
		this.name = name;
	}

	@JsonProperty("description")
	public String getDescription() {
		return description;
	}

	@JsonProperty("description")
	public void setDescription(String description) {
		this.description = description;
	}

	@JsonProperty("modified")
	public String getModified() {
		return modified;
	}

	@JsonProperty("modified")
	public void setModified(String modified) {
		this.modified = modified;
	}

	@JsonProperty("resourceURI")
	public String getResourceURI() {
		return resourceURI;
	}

	@JsonProperty("resourceURI")
	public void setResourceURI(String resourceURI) {
		this.resourceURI = resourceURI;
	}

	@JsonProperty("event")
	public Event getEvent() {
		return event;
	}

	@JsonProperty("event")
	public void setEvent(Event event) {
		this.event = event;
	}

	@JsonProperty("series")
	public Event getSeries() {
		return series;
	}

	@JsonProperty("series")
	public void setSeries(Event series) {
		this.series = series;
	}

	@JsonProperty("stories")
	public Event getStories() {
		return stories;
	}

	@JsonProperty("stories")
	public void setStories(Event stories) {
		this.stories = stories;
	}

	@JsonProperty("events")
	public Event getEvents() {
		return events;
	}

	@JsonProperty("events")
	public void setEvents(Event events) {
		this.events = events;
	}


	@Override public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;

		Result result = (Result) o;

		if (id != null ? !id.equals(result.id) : result.id != null)
			return false;
		if (name != null ? !name.equals(result.name) : result.name != null)
			return false;
		if (description != null ? !description.equals(result.description) : result.description != null)
			return false;
		if (modified != null ? !modified.equals(result.modified) : result.modified != null)
			return false;
		if (resourceURI != null ? !resourceURI.equals(result.resourceURI) : result.resourceURI != null)
			return false;
		if (event != null ? !event.equals(result.event) : result.event != null)
			return false;
		if (series != null ? !series.equals(result.series) : result.series != null)
			return false;
		if (stories != null ? !stories.equals(result.stories) : result.stories != null)
			return false;
		return events != null ? events.equals(result.events) : result.events == null;
	}

	@Override public int hashCode() {
		int result = id != null ? id.hashCode() : 0;
		result = 31 * result + (name != null ? name.hashCode() : 0);
		result = 31 * result + (description != null ? description.hashCode() : 0);
		result = 31 * result + (modified != null ? modified.hashCode() : 0);
		result = 31 * result + (resourceURI != null ? resourceURI.hashCode() : 0);
		result = 31 * result + (event != null ? event.hashCode() : 0);
		result = 31 * result + (series != null ? series.hashCode() : 0);
		result = 31 * result + (stories != null ? stories.hashCode() : 0);
		result = 31 * result + (events != null ? events.hashCode() : 0);
		return result;
	}
}
