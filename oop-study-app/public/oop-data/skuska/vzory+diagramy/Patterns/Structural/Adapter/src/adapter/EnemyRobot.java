/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package adapter;

import java.util.Random;

/**
 *toto je adaptee
 * @author Ageiris
 */
public class EnemyRobot {
    Random generator = new Random();
    
    public void smashWithHands(){
        
        int attackDamage = generator.nextInt(10)+1;
        System.out.println("Enemy robot causes "+attackDamage + " with his hands");
    }
    
    public void walkForward(){
        int movement = generator.nextInt(5)+1;
        System.out.println("Enemy robot walks forward "+movement+" spaces");
    }
    
    public void reactToHuman(String driverName){
        System.out.println("Enemy robot tramps on "+driverName);
    }
}
