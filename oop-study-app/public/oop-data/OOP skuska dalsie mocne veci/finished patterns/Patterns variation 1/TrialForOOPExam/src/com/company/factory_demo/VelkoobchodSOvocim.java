package com.company.factory_demo;

/**
 * Created by Marián Desktop on 01.01.2017.
 */
public class VelkoobchodSOvocim extends Velkoobchod {
    @Override
    public Ovocie vytvorOvocie(String name) {
        switch (name){
            case "Pomaranc" : return new Pomaranc(name);
            case "Jablko" : return new Jablko(name);
        }
        return null;
    }
}
