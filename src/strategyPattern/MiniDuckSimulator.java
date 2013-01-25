/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package strategyPattern;

import strategyPattern.imAex.MallardDuck;
import strategyPattern.iAa.Duck;

/**
 *
 * @author Meak
 */
public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.quack();
        mallard.display();
        mallard.fly();
    }
}
