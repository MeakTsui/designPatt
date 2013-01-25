/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package strategyPattern.iAa;
/**
 *
 * @author Meak
 */
public abstract class Duck {
    protected FlyBehavior flyBehavior;
    protected QuackBehavior quackBehavior;
    public Duck(){};
    public void fly(){
        flyBehavior.fly();
    }
    public void quack(){
        quackBehavior.quack();
    }
    public abstract void display();
    public abstract void swim();

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
    
}
