package standalone.domain;

import java.util.Date;

public class QuakeCollectionMetaData {
	private Date generated;
	private String url;
	private String title;
	private String subTitle;
	private int cacheMaxAge;

	public Date getGenerated() {
		return generated;
	}

	public void setGenerated(Date generated) {
		this.generated = generated;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSubTitle() {
		return subTitle;
	}

	public void setSubTitle(String subTitle) {
		this.subTitle = subTitle;
	}

	public int getCacheMaxAge() {
		return cacheMaxAge;
	}

	public void setCacheMaxAge(int cacheMaxAge) {
		this.cacheMaxAge = cacheMaxAge;
	}
}
