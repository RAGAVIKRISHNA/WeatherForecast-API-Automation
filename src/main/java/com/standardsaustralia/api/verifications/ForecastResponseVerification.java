package com.standardsaustralia.api.verifications;

import static org.testng.Assert.assertTrue;

import org.apache.commons.lang3.StringUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.standardsaustralia.weather.forecast.ForecastData;
import com.standardsaustralia.weather.forecast.ForecastWeatherResponse;

public class ForecastResponseVerification {
   
	@Test	
	public void responseCodeValidation(int  expected, int actual) {
		try {
			Assert.assertEquals(expected, actual, "Successfully Validated the response code, satus code is : " + actual);
		}	
		catch(AssertionError e)
		{
			 Assert.fail("Status Code Validation failed with the status code : "+ actual + "Expected status code as "+ expected);
		}	
		catch(Exception e1)
		{
			 Assert.fail(e1.getMessage());
		}	
	}
	
	@Test
	public void weatherForecastKeyValidation(ForecastData forecastData) {	   	
	   for(ForecastWeatherResponse data : forecastData.getForecastData()) {
		   try {
			   assertTrue(StringUtils.isNotEmpty(data.getTimezone()));
		   }
		   catch(AssertionError e)
		   {
			   Assert.fail("Unable to fetch timezone value from the response or timezone is null or empty " + e.getMessage());
		   }
		   try {
			   assertTrue(data.getWeather()!=null);
		   }
		   catch(AssertionError e)
		   {
			   Assert.fail("Response is null or unable to fetch weather results from the response "+ e.getMessage());
		   }
		   try {
			   assertTrue(StringUtils.isNotEmpty(data.getState_code()));
		   }
		   catch(AssertionError e)
		   {
			   Assert.fail("Response is null or unable to fetch state code value from the response "+ e.getMessage());
		   }
	   }
	   
	}
	
	@Test
	public void stateCodeKeyValidation(ForecastData forecastData) {	   	
	   for(ForecastWeatherResponse data : forecastData.getForecastData()) {		
		   try {
			   assertTrue(data!=null);
			   assertTrue(StringUtils.isNotEmpty(data.getState_code()));			   
		   }
		   catch(AssertionError e)
		   {
			   Assert.fail("Response is null or unable to fetch state code value from the response "+ e.getMessage());
		   }
	   }
	   
	}
}
