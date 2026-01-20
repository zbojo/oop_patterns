package strategy;

/**
 *
 * @author Vlado
 */
public class ConcreteStrategyA implements IStrategy {
    
    @Override
    public void strategyBehaviour(){
        System.out.println("Som agresivny robot, utocim.");
    }
    
}
