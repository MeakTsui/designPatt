/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package observorPattern.imAex;

import observorPattern.iAa.DisplayElement;
import observorPattern.iAa.Observer;
import observorPattern.iAa.Subject;

/**
 *
 * @author Meak
 */
public class CurrentConditionsDisplay implements Observer,DisplayElement{
    
    private float temperature;
    private float humidity;
    private Subject weatherData;
    
    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        display();
    }

    @Override
    public void display() {
        System.out.println("Current conditions:"+temperature+"F degrees and "+
                humidity+"% humidity");
    }
    
    public CurrentConditionsDisplay(Subject weatherDate){
        this.weatherData = weatherDate;
        weatherDate.regiterObserver(this);
    }
}
