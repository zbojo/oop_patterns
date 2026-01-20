/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactoryproject;

/**
 *
 * @author Stevo
 */
public class SkladMisko extends Dodavatel {

    @Override
    public Ovocie dodajOvocie(String name) {
        switch (name) {
            case "Jablko":
                return new Jablko();
            case "Hruska":
                return new Hruska();
            case "Slivka":
                return new Slivka();
        }
        return null;
    }

    @Override
    public Zelenina dodajZelenina(String name) {
        switch (name) {
            case "Zemiak":
                return new Zemiak();
            case "Karfiol":
                return new Karfiol();
        }
        return null;
    }

}
