package com.standardsaustralia.weather.forecast;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ForecastWeatherResponse implements Serializable{
	

	private static final long serialVersionUID = 1L;
	
	   public int rh;
	    public String pod;
	    public double lon;
	    public double pres;
	    public String timezone;
	    public String ob_time;
	    public String country_code;
	    public int clouds;
	    public int ts;
	    public int solar_rad;
	    public String state_code;
	    public String city_name;
	    public int wind_spd;
	    public String wind_cdir_full;
	    public String wind_cdir;
	    public double slp;
	    public int vis;
	    public int h_angle;
	    public String sunset;
	    public int dni;
	    public double dewpt;
	    public int snow;
	    public int uv;
	    public int precip;
	    public int wind_dir;
	    public String sunrise;
	    public int ghi;
	    public int dhi;
	    public int aqi;
	    public double lat;
	    public Weather weather;
	    public String datetime;
	    public double temp;
	    public String station;
	    public double elev_angle;
	    public double app_temp;
		public int getRh() {
			return rh;
		}
		public void setRh(int rh) {
			this.rh = rh;
		}
		public String getPod() {
			return pod;
		}
		public void setPod(String pod) {
			this.pod = pod;
		}
		public double getLon() {
			return lon;
		}
		public void setLon(double lon) {
			this.lon = lon;
		}
		public double getPres() {
			return pres;
		}
		public void setPres(double pres) {
			this.pres = pres;
		}
		public String getTimezone() {
			return timezone;
		}
		public void setTimezone(String timezone) {
			this.timezone = timezone;
		}
		public String getOb_time() {
			return ob_time;
		}
		public void setOb_time(String ob_time) {
			this.ob_time = ob_time;
		}
		public String getCountry_code() {
			return country_code;
		}
		public void setCountry_code(String country_code) {
			this.country_code = country_code;
		}
		public int getClouds() {
			return clouds;
		}
		public void setClouds(int clouds) {
			this.clouds = clouds;
		}
		public int getTs() {
			return ts;
		}
		public void setTs(int ts) {
			this.ts = ts;
		}
		public int getSolar_rad() {
			return solar_rad;
		}
		public void setSolar_rad(int solar_rad) {
			this.solar_rad = solar_rad;
		}
		public String getState_code() {
			return state_code;
		}
		public void setState_code(String state_code) {
			this.state_code = state_code;
		}
		public String getCity_name() {
			return city_name;
		}
		public void setCity_name(String city_name) {
			this.city_name = city_name;
		}
		public int getWind_spd() {
			return wind_spd;
		}
		public void setWind_spd(int wind_spd) {
			this.wind_spd = wind_spd;
		}
		public String getWind_cdir_full() {
			return wind_cdir_full;
		}
		public void setWind_cdir_full(String wind_cdir_full) {
			this.wind_cdir_full = wind_cdir_full;
		}
		public String getWind_cdir() {
			return wind_cdir;
		}
		public void setWind_cdir(String wind_cdir) {
			this.wind_cdir = wind_cdir;
		}
		public double getSlp() {
			return slp;
		}
		public void setSlp(double slp) {
			this.slp = slp;
		}
		public int getVis() {
			return vis;
		}
		public void setVis(int vis) {
			this.vis = vis;
		}
		public int getH_angle() {
			return h_angle;
		}
		public void setH_angle(int h_angle) {
			this.h_angle = h_angle;
		}
		public String getSunset() {
			return sunset;
		}
		public void setSunset(String sunset) {
			this.sunset = sunset;
		}
		public int getDni() {
			return dni;
		}
		public void setDni(int dni) {
			this.dni = dni;
		}
		public double getDewpt() {
			return dewpt;
		}
		public void setDewpt(double dewpt) {
			this.dewpt = dewpt;
		}
		public int getSnow() {
			return snow;
		}
		public void setSnow(int snow) {
			this.snow = snow;
		}
		public int getUv() {
			return uv;
		}
		public void setUv(int uv) {
			this.uv = uv;
		}
		public int getPrecip() {
			return precip;
		}
		public void setPrecip(int precip) {
			this.precip = precip;
		}
		public int getWind_dir() {
			return wind_dir;
		}
		public void setWind_dir(int wind_dir) {
			this.wind_dir = wind_dir;
		}
		public String getSunrise() {
			return sunrise;
		}
		public void setSunrise(String sunrise) {
			this.sunrise = sunrise;
		}
		public int getGhi() {
			return ghi;
		}
		public void setGhi(int ghi) {
			this.ghi = ghi;
		}
		public int getDhi() {
			return dhi;
		}
		public void setDhi(int dhi) {
			this.dhi = dhi;
		}
		public int getAqi() {
			return aqi;
		}
		public void setAqi(int aqi) {
			this.aqi = aqi;
		}
		public double getLat() {
			return lat;
		}
		public void setLat(double lat) {
			this.lat = lat;
		}
		public Weather getWeather() {
			return weather;
		}
		public void setWeather(Weather weather) {
			this.weather = weather;
		}
		public String getDatetime() {
			return datetime;
		}
		public void setDatetime(String datetime) {
			this.datetime = datetime;
		}
		public double getTemp() {
			return temp;
		}
		public void setTemp(double temp) {
			this.temp = temp;
		}
		public String getStation() {
			return station;
		}
		public void setStation(String station) {
			this.station = station;
		}
		public double getElev_angle() {
			return elev_angle;
		}
		public void setElev_angle(double elev_angle) {
			this.elev_angle = elev_angle;
		}
		public double getApp_temp() {
			return app_temp;
		}
		public void setApp_temp(double app_temp) {
			this.app_temp = app_temp;
		}
	}
