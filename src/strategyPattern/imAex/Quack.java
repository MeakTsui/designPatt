/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package strategyPattern.imAex;

import strategyPattern.iAa.QuackBehavior;

/**
 *
 * @author Meak
 */
public class Quack implements QuackBehavior{

    @Override
    public void quack() {
        System.out.println("quack");
    }
    
}
