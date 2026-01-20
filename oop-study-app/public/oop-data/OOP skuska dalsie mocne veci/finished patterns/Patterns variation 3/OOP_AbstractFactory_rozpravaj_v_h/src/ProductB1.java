/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author viktorooo
 */
public class ProductB1 implements AbstractProductB{
    public ProductB1(){
        this.rozpravaj();
    }

    @Override
    public void rozpravaj() {
        System.out.println("Princeznabude len moja");
    }
}
