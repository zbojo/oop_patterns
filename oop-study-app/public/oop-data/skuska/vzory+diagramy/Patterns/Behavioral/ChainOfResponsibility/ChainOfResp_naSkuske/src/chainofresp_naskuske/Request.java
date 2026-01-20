/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package chainofresp_naskuske;

import java.io.DataInputStream;
import java.io.IOException;

/**
 *
 * @author ESKOPC
 */
public class Request {
    
   private int request;
   
   
   public int getRequest(){
       return request;
   }
   
   public void getRequestNumber()
   {
       System.out.println("Zadajte sumu: ");
       DataInputStream in = new DataInputStream(System.in);
       try{
       request = Integer.parseInt(in.readLine());
       }catch(IOException| NumberFormatException e){System.out.println(e.getMessage());}
   }
    
}
