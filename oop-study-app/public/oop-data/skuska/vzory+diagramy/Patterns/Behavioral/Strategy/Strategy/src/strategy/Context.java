package strategy;

/**
 *
 * @author Vlado
 */
public class Context implements IStrategy {
    private String name;
    private IStrategy strategy;
    
    @Override
    public void strategyBehaviour(){
        System.out.print(this.name + ": ");
        strategy.strategyBehaviour();
        
    }
    
    public void setName(String meno){
        this.name = meno;
    }
    
    public void setStrategy(IStrategy spravanie){
        this.strategy = spravanie;
    }
    
}
