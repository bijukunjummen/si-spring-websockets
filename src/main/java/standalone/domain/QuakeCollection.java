package standalone.domain;

import java.util.List;

public class QuakeCollection {
	private String type;
	private List<QuakeIncident> features;
	private QuakeCollectionMetaData metadata;
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public List<QuakeIncident> getFeatures() {
		return features;
	}
	public void setFeatures(List<QuakeIncident> features) {
		this.features = features;
	}

	public QuakeCollectionMetaData getMetadata() {
		return metadata;
	}

	public void setMetadata(QuakeCollectionMetaData metadata) {
		this.metadata = metadata;
	}

	@Override
	public String toString() {
		return "QuakeCollection [type=" + type + ", features=" + features + "]";
	}
}
