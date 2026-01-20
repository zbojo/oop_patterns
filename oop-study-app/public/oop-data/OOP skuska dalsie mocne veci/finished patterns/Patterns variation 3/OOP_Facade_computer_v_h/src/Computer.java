/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author viktorooo
 */
public class Computer {
    private CPU cpu;
    private RAM ram;
    private HDD disc;
    
    public Computer(){
        this.cpu=new CPU();
        this.ram=new RAM();
        this.disc=new HDD();
    }
    
    public void zapni(){
        System.out.println("zapinam PC ....");
        cpu.zapni();
        ram.nacitaj();
        disc.otacaj();
    }
}
