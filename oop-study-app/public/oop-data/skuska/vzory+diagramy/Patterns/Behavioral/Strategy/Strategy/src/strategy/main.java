package strategy;

/**
 *
 * @author Vlado
 */
public class main {
    public static void main(String[] args) {
        Context Robot1 = new Context();
        Context Robot2 = new Context();
        
        ConcreteStrategyA spravanie1 = new ConcreteStrategyA();
        ConcreteStrategyB spravanie2 = new ConcreteStrategyB();
        ConcreteStrategyC spravanie3 = new ConcreteStrategyC();
        
        Robot1.setName("ROBOT1");
        Robot2.setName("ROBOT2");
        
        Robot1.setStrategy(spravanie1);
        Robot1.strategyBehaviour();
        
        Robot1.setStrategy(spravanie2);
        Robot1.strategyBehaviour();
        
        Robot1.setStrategy(spravanie3);
        Robot1.strategyBehaviour();
        
        Robot2.setStrategy(spravanie1);
        Robot2.strategyBehaviour();
        
        Robot2.setStrategy(spravanie2);
        Robot2.strategyBehaviour();
        
        Robot2.setStrategy(spravanie3);
        Robot2.strategyBehaviour();
    }
}
