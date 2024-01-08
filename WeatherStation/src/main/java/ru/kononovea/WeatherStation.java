package ru.kononovea;

import ru.kononovea.observer.display.impl.CurrentConditionsDisplay;
import ru.kononovea.observer.display.impl.ForecastDisplay;
import ru.kononovea.observer.display.impl.HeatIndexDisplay;
import ru.kononovea.observer.display.impl.StatisticsDisplay;
import ru.kononovea.subject.weather_data.WeatherData;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);
    }
}