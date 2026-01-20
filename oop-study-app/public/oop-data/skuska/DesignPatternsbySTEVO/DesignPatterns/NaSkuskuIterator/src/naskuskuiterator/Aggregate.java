/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package naskuskuiterator;

import java.util.ArrayList;

/**
 *
 * @author Stevo
 */
public abstract class Aggregate {
    ArrayList<Zamestnanec> zoznamZamestnancov;
    public abstract Iterator createIterator();
    public abstract void addZamestnanec(Zamestnanec newZamestnanec);
}
