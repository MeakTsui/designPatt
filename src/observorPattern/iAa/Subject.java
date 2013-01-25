/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package observorPattern.iAa;

/**
 *
 * @author Meak
 */
public interface Subject {
    
    public void regiterObserver(Observer o);
    public void removerObserver(Observer o);
    
    /**
     * when the state changes,this method will
     * be used to notify all Observers.
     */
    public void notifyObservers();
}
