package com.standardsaustralia.weather.forecast;

import java.io.Serializable;

public class Weather implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	public String icon;
	public int code;
	public String description;
	
	public String getIcon() {
		return icon;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	  
}
