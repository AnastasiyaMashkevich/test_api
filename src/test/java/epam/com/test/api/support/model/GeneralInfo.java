package epam.com.test.api.support.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class GeneralInfo {

	@JsonProperty("code")
	private Integer code;
	@JsonProperty("status")
	private String status;
	@JsonProperty("copyright")
	private String copyright;
	@JsonProperty("attributionText")
	private String attributionText;
	@JsonProperty("attributionHTML")
	private String attributionHTML;
	@JsonProperty("etag")
	private String etag;
	@JsonProperty("data")
	private Data data;

	public GeneralInfo() {

	}

	@JsonProperty("code")
	public Integer getCode() {
		return code;
	}

	@JsonProperty("code")
	public void setCode(Integer code) {
		this.code = code;
	}

	@JsonProperty("status")
	public String getStatus() {
		return status;
	}

	@JsonProperty("status")
	public void setStatus(String status) {
		this.status = status;
	}

	@JsonProperty("copyright")
	public String getCopyright() {
		return copyright;
	}

	@JsonProperty("copyright")
	public void setCopyright(String copyright) {
		this.copyright = copyright;
	}

	@JsonProperty("attributionText")
	public String getAttributionText() {
		return attributionText;
	}

	@JsonProperty("attributionText")
	public void setAttributionText(String attributionText) {
		this.attributionText = attributionText;
	}

	@JsonProperty("attributionHTML")
	public String getAttributionHTML() {
		return attributionHTML;
	}

	@JsonProperty("attributionHTML")
	public void setAttributionHTML(String attributionHTML) {
		this.attributionHTML = attributionHTML;
	}

	@JsonProperty("etag")
	public String getEtag() {
		return etag;
	}

	@JsonProperty("etag")
	public void setEtag(String etag) {
		this.etag = etag;
	}

	@JsonProperty("data")
	public Data getData() {
		return data;
	}

	@JsonProperty("data")
	public void setData(Data data) {
		this.data = data;
	}

	@Override public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;

		GeneralInfo that = (GeneralInfo) o;

		if (code != null ? !code.equals(that.code) : that.code != null)
			return false;
		if (status != null ? !status.equals(that.status) : that.status != null)
			return false;
		if (copyright != null ? !copyright.equals(that.copyright) : that.copyright != null)
			return false;
		if (attributionText != null ? !attributionText.equals(that.attributionText) : that.attributionText != null)
			return false;
		if (attributionHTML != null ? !attributionHTML.equals(that.attributionHTML) : that.attributionHTML != null)
			return false;
		if (etag != null ? !etag.equals(that.etag) : that.etag != null)
			return false;
		return data != null ? data.equals(that.data) : that.data == null;
	}

	@Override public int hashCode() {
		int result = code != null ? code.hashCode() : 0;
		result = 31 * result + (status != null ? status.hashCode() : 0);
		result = 31 * result + (copyright != null ? copyright.hashCode() : 0);
		result = 31 * result + (attributionText != null ? attributionText.hashCode() : 0);
		result = 31 * result + (attributionHTML != null ? attributionHTML.hashCode() : 0);
		result = 31 * result + (etag != null ? etag.hashCode() : 0);
		result = 31 * result + (data != null ? data.hashCode() : 0);
		return result;
	}
}
