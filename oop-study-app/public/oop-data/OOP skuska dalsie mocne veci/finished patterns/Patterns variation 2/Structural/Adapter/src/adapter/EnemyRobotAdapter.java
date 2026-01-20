/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package adapter;

/**
 *
 * @author Ageiris
 */
public class EnemyRobotAdapter implements EnemyAttacker{
    
    EnemyRobot theRobot;
    
    public EnemyRobotAdapter(EnemyRobot newRobot){
        theRobot = newRobot;
    }

    @Override
    public void fireWeapon() {
        theRobot.smashWithHands();
    }

    @Override
    public void driveForward() {
        theRobot.walkForward();
    }

    @Override
    public void assignDriver(String driverName) {
        theRobot.reactToHuman(driverName);
    }
    
    
}
