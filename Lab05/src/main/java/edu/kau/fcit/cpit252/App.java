package edu.kau.fcit.cpit252;

import edu.kau.fcit.cpit252.geoLocation.GeoLocation;
import edu.kau.fcit.cpit252.weatherDB.WeatherDBI;

public class App {
    public static void main(String[] args) {
        // Jeddah => 21.543333, 39.172778
        
        Adapter adapter = new Adapter();
        System.out.println(adapter.getWeatherInfo(21.543333, 39.172778));
        System.out.println(adapter.getWeatherInfo("Jeddah"));
    }
}
