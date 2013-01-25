/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package strategyPattern.imAex;

import strategyPattern.iAa.Duck;

/**
 *
 * @author Meak
 */
public class MallardDuck extends Duck{

    public MallardDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }
    
    @Override
    public void display() {
        System.out.println("I am a Mallar duck");
    }

    @Override
    public void swim() {
        System.out.println("slloekld ");
    }
    
}
