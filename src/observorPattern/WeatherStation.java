/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package observorPattern;

import observorPattern.imAex.CurrentConditionsDisplay;
import observorPattern.imAex.WeatherData;

/**
 *
 * @author Meak
 */
public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentDisplay = new 
                    CurrentConditionsDisplay(weatherData);
        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 79, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);
    }
}
