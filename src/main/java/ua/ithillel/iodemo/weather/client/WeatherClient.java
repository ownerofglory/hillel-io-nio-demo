package ua.ithillel.iodemo.weather.client;

import ua.ithillel.iodemo.weather.model.WeatherInfo;

public interface WeatherClient {
    WeatherInfo getWeatherByCity(String city);
}
