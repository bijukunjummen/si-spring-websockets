package standalone.domain;


public class QuakeIncident {
	private String id;
	private String type;
	private QuakeProperty properties;
	private QuakeGeometry geometry;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public QuakeProperty getProperties() {
		return properties;
	}
	public void setProperties(QuakeProperty properties) {
		this.properties = properties;
	}
	
	public QuakeGeometry getGeometry() {
		return geometry;
	}
	public void setGeometry(QuakeGeometry geometry) {
		this.geometry = geometry;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "QuakeIncident [id=" + id + ", properties=" + properties + ", geometry=" + geometry + "]";
	}
}
