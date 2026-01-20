
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author viktorooo
 */
public class AdapteeList {
    private List<Object> zoznam= new ArrayList<>();
    private int head=0;
    private int tail=0;
    public AdapteeList(){
        
    }
    public int getTail(){
        return this.tail;
    }
    
    public void insertHead(String s){
        zoznam.add(head, s);
        tail=zoznam.size()-1;
    }
    
    public void removeHead(){
        zoznam.remove(head);
        tail=zoznam.size()-1;
    }
    
    public void insertTail(String s){
        zoznam.add(tail,s);
        tail=zoznam.size()-1;
    }
    
    public void removeTail(){
        zoznam.remove(tail);
        tail=zoznam.size()-1;
    }
    
    public List getList(){
        return this.zoznam;
    }
    
}
