/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author ESKOPC
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Singleton sing1 = new Singleton(); ---instancie sa nedaju vytvarat priamo iba cez metodu
        Singleton sing1 =Singleton.getInstance();
        sing1.setData(30);
        sing1.printData();
        
        Singleton sing2 = Singleton.getInstance(); // nova instancia sa nevytvori ale sing1 == sing2
        sing2.setData(55); // kedze ide o tu istu instanciu ako sing1 zmeni sa aj ona
        
        sing2.printData(); 
        sing1.printData(); //ukazka sing1 == sing2
    }
}

