package strategy;

/**
 *
 * @author Vlado
 */
public class ConcreteStrategyC implements IStrategy {
    
    @Override
    public void strategyBehaviour(){
        System.out.println("Som neutralny robot, ignorujem ostatnych.");
    }
    
}
