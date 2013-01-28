/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package observorPattern.imAex;

import java.util.ArrayList;
import observorPattern.iAa.Observer;
import observorPattern.iAa.Subject;

/**
 *
 * @author Meak
 */
public class WeatherData implements Subject{
    
    private ArrayList<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        this.observers = new ArrayList<Observer>();
    }
    
    
    
    @Override
    public void regiterObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removerObserver(Observer o) {
        int i = observers.indexOf(o);
        if(i>=0){
            observers.remove(i);
        }
    }

    @Override
    public void notifyObservers() {
        for(int i = 0;i<observers.size();i++){
            Observer observer = (Observer)observers.get(i);
            observer.update(temperature, humidity, pressure);
        }
    }
    public void measurementsChanged(){
        notifyObservers();
    }
    
    public void setMeasurements(float temperature,float humidity,float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}
