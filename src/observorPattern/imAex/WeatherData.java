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
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void removerObserver(Observer o) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void notifyObservers() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
