package epam.com.test.api.support.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;


import java.util.List;


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Data {

	@JsonProperty("offset")
	private Integer offset;
	@JsonProperty("limit")
	private Integer limit;
	@JsonProperty("total")
	private Integer total;
	@JsonProperty("count")
	private Integer count;
	@JsonProperty("results")
	private List<Result> results = null;

	public Data() {

	}

	@JsonProperty("offset")
	public Integer getOffset() {
		return offset;
	}

	@JsonProperty("offset")
	public void setOffset(Integer offset) {
		this.offset = offset;
	}

	@JsonProperty("limit")
	public Integer getLimit() {
		return limit;
	}

	@JsonProperty("limit")
	public void setLimit(Integer limit) {
		this.limit = limit;
	}

	@JsonProperty("total")
	public Integer getTotal() {
		return total;
	}

	@JsonProperty("total")
	public void setTotal(Integer total) {
		this.total = total;
	}

	@JsonProperty("count")
	public Integer getCount() {
		return count;
	}

	@JsonProperty("count")
	public void setCount(Integer count) {
		this.count = count;
	}

	@JsonProperty("results")
	public List<Result> getResults() {
		return results;
	}

	@JsonProperty("results")
	public void setResults(List<Result> results) {
		this.results = results;
	}

	@Override public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;

		Data data = (Data) o;

		if (!offset.equals(data.offset))
			return false;
		if (!limit.equals(data.limit))
			return false;
		if (!total.equals(data.total))
			return false;
		if (!count.equals(data.count))
			return false;
		return results.equals(data.results);
	}

	@Override public int hashCode() {
		int result = offset.hashCode();
		result = 31 * result + limit.hashCode();
		result = 31 * result + total.hashCode();
		result = 31 * result + count.hashCode();
		result = 31 * result + results.hashCode();
		return result;
	}
}
