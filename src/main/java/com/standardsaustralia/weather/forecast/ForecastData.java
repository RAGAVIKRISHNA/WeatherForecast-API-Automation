package com.standardsaustralia.weather.forecast;

import java.io.Serializable;
import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ForecastData implements Serializable {

	private static final long serialVersionUID = 1L;
	public ArrayList<ForecastWeatherResponse> data=new ArrayList<>();

	public ArrayList<ForecastWeatherResponse> getForecastData() {
		return data;
	}

	public void setForecastData(ArrayList<ForecastWeatherResponse> forecastData) {
		this.data = forecastData;
	}

}
