package standalone.domain;

import java.util.Date;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;



public class QuakeProperty {
	private float mag;
	private String place;
	private Date time;
	private Date updated;
	private int felt;
	private int cdi;
	private int tz;
	private String url;
	public float getMag() {
		return mag;
	}
	public void setMag(float magnitude) {
		this.mag = magnitude;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public Date getTime() {
		return time;
	}

	public Date getUpdated() {
		return updated;
	}

	public void setUpdated(Date updated) {
		this.updated = updated;
	}

	public void setTime(Date date) {
		this.time = date;
	}
	public int getFelt() {
		return felt;
	}
	public void setFelt(int felt) {
		this.felt = felt;
	}
	public int getCdi() {
		return cdi;
	}
	public void setCdi(int cdi) {
		this.cdi = cdi;
	}
	public int getTz() {
		return tz;
	}
	public void setTz(int tz) {
		this.tz = tz;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public String toString() {
		return "QuakeProperty [magnitude=" + mag + ", place=" + place + ", date=" + time + ", felt=" + felt + ", cdi=" + cdi + ", tz=" + tz + "]";
	}
	
}
