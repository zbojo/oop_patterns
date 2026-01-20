/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package computer;

/**
 *
 * @author ESKOPC
 */
//****FACADE******
public class Computer {
    
    private CPU cpu;
    private Memory mem;
    private HDD hdd;
    
    public Computer()
    {
        cpu = new CPU();
        mem = new Memory();
        hdd = new HDD();
    }
    
    public void startComputer()
    {
        cpu.spusti();
        mem.nacitaj();
        hdd.otacaj();
    }
    
}
