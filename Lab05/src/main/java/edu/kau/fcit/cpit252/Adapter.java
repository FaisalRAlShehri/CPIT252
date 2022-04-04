/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.kau.fcit.cpit252;

import edu.kau.fcit.cpit252.geoLocation.GeoLocation;
import edu.kau.fcit.cpit252.weatherDB.WeatherDBI;

public class Adapter implements WeatherCity, WeatherGeo{
    WeatherDBI weatherDBI = new WeatherDBI();
    GeoLocation geoLocation = new GeoLocation();
    
    @Override
    public String getWeatherInfo(double latitude, double longitude){
        return weatherDBI.getWeatherInfo(geoLocation.search(latitude, longitude));
    }
    
        @Override
    public String getWeatherInfo(String city){
        return weatherDBI.getWeatherInfo(city);
    }
}
