/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package state;

/**
 *
 * @author ondrej
 */
public class RiadiaciPanel {

    private State stav;
    private Fakla fakla;

    public RiadiaciPanel() {
        stav = new Nepristupny();
    }

    public void pouziPanel() {

        stav.handle();

    }
    public void kontrolujFaklu(Fakla fakla){
        
        this.fakla = fakla;
        
    }
    

    public void setState(String name) {

        switch (name) {
            case "nepristupny":
                stav = new Nepristupny();
                break;
            case "pristupny":
                stav = new Pristupny(fakla, this);
                break;
            case "zabijak":
                stav = new Zabijak();
                break;
            case "vydavac":
                stav = new VydavacPenazi();
                break;
            default:
                break;

        }

    }
}
