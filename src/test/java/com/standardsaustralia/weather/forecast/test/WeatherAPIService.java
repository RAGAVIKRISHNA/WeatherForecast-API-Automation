package com.standardsaustralia.weather.forecast.test;

import static io.restassured.RestAssured.given;

import com.standardsaustralia.api.verifications.ForecastResponseVerification;
import com.standardsaustralia.weather.forecast.ForecastData;

import io.restassured.response.Response;
import org.testng.annotations.Test;
import org.testng.Reporter;

import java.io.FileInputStream;
import java.util.Properties;


@Test
public class WeatherAPIService {

	static WeatherAPIService weatherAPIservice= new WeatherAPIService();
	static Response response;
	static Properties prop = new Properties();
	
	public void loadProperties()
	{
		 try {
		       
		String userDir = System.getProperty("user.dir");
   	    String filePath = userDir+"\\src\\main\\java\\com\\standardsaustralia\\config\\config.properties";
        prop.load(new FileInputStream(filePath));
	} catch (Exception e) {
        e.printStackTrace();
    }
	
	}
@Test
	public static void getForecastedWeatherData()  {
	weatherAPIservice.loadProperties();
	response = (Response) given().queryParam("postal_code", prop.getProperty("postal_code")) 
               .queryParam("key", prop.getProperty("key")).when()
               .get(prop.getProperty("weatheruri"));
	        
		   Reporter.log("Status Code for weather forecasting api is : "+response.getStatusCode());
		   Reporter.log("Response time for weather forecasting api is : "+response.getTime());
		   Reporter.log(response.getBody().asString());
		   ForecastData forecastData= response.getBody().as(ForecastData.class);		
		   ForecastResponseVerification verifyReponse = new ForecastResponseVerification();
			   
		   verifyReponse.responseCodeValidation(response.getStatusCode(),200);			
		   verifyReponse.weatherForecastKeyValidation(forecastData);
		   		
}
@Test
public static void getCurrentWeatherData() {
	weatherAPIservice.loadProperties();
	response = (Response) given()
			.queryParam("lat", prop.getProperty("latitude")) 
			.queryParam("lon", prop.getProperty("longitude")) 
            .queryParam("key", prop.getProperty("key")).when()
            .get(prop.getProperty("weatheruri"));
	
	    Reporter.log("Status Code for weather forecasting api is : "+response.getStatusCode());
	   Reporter.log("Response time for weather forecasting api is : "+response.getTime());
	   Reporter.log(response.getBody().asString());
	   ForecastData forecastData= response.getBody().as(ForecastData.class);		
	   ForecastResponseVerification verifyReponse = new ForecastResponseVerification();
		   
	   verifyReponse.responseCodeValidation(response.getStatusCode(),200);			
	   verifyReponse.weatherForecastKeyValidation(forecastData);	   		
}
}
