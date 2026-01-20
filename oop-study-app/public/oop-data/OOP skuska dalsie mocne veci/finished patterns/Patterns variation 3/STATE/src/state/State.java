/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package state;

/**
 *
 * @author ondrej
 */
public class STATE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        RiadiaciPanel panel = new RiadiaciPanel();
        Dvere dvere = new Dvere();
        Fakla fakla = new Fakla(panel, dvere);
        
        panel.kontrolujFaklu(fakla);
        
        panel.pouziPanel();
        fakla.zatiahni();
        panel.pouziPanel();
        dvere.close();
        panel.pouziPanel();
        fakla.zatiahni();
        //fakla.vrat();
        panel.pouziPanel();
        
        
    }
}
