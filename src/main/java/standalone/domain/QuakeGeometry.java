package standalone.domain;

import java.util.Arrays;

public class QuakeGeometry {
	private String type;
	private double[] coordinates;

	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double[] getCoordinates() {
		return coordinates;
	}
	public void setCoordinates(double[] coordinates) {
		this.coordinates = coordinates;
	}
	@Override
	public String toString() {
		return "QuakeGeometry [type=" + type + ", coordinates=" + Arrays.toString(coordinates) + "]";
	}
	
	
}
