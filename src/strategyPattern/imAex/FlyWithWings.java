/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package strategyPattern.imAex;

import strategyPattern.iAa.FlyBehavior;

/**
 *
 * @author Meak
 */
public class FlyWithWings implements FlyBehavior{

    @Override
    public void fly() {
        System.out.println("I'm flying!");
    }
    
}
