/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package adapter;

/**
 *
 * @author Ageiris
 */
public class Adapter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EnemyTank warrior = new EnemyTank();
        EnemyRobot freddieRobot = new EnemyRobot();
        EnemyAttacker  robotAdapter = new EnemyRobotAdapter(freddieRobot);
        
        System.out.println("The robot");
        freddieRobot.reactToHuman("Paul");
        freddieRobot.walkForward();
        freddieRobot.smashWithHands();
        
        System.out.println("Enemy tank");
        warrior.assignDriver("Frank");
        warrior.driveForward();
        warrior.fireWeapon();
        
        System.out.println("The robot with adapter");
        robotAdapter.assignDriver("Mark");
        robotAdapter.driveForward();
        robotAdapter.fireWeapon();
    }
}
