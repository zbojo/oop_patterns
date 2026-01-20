package com.company;

import com.company.abstractFactory_demo.AbstractFactory;
import com.company.abstractFactory_demo.ConcreteFactory1;
import com.company.abstractFactory_demo.ConcreteFactory2;
import com.company.adapter_demo.Dalekohlad;
import com.company.adapter_demo.Hviezda;
import com.company.chainOfResonsibility_demo.Sklad;
import com.company.chainOfResonsibility_demo.SkladMatko;
import com.company.chainOfResonsibility_demo.SkladMisko;
import com.company.chainOfResonsibility_demo.SkladPeter;
import com.company.composite_demo.Composite;
import com.company.composite_demo.Leaf;
import com.company.decorator_demo.*;
import com.company.facade_demo.VelkoobchodFacade;
import com.company.factory_demo.Velkoobchod;
import com.company.factory_demo.VelkoobchodSOvocim;
import com.company.builder_demo.Bojovnik;
import com.company.builder_demo.Director;
import com.company.builder_demo.Sedliak;
import com.company.iterator_demo.ConcreteIterator;
import com.company.iterator_demo.Zamestnanec;
import com.company.iterator_demo.ZoznamZamestnancov;
import com.company.observer_demo.ConcreteObservable;
import com.company.observer_demo.ConcreteObserverA;
import com.company.observer_demo.ConcreteObserverB;
import com.company.prototype_demo.Apple;
import com.company.proxy_demo.FBIwebpage;
import com.company.proxy_demo.ProxyMachine;
import com.company.proxy_demo.wwwFBIcom;
import com.company.singleton_demo.Singleton;
import com.company.strategy_demo.*;
import com.company.virtualproxy_demo.ProxyImage;
import com.company.visitor_demo.*;

import java.util.ArrayList;

public class Main {

    public static Object getNewClone(Object obj){
        Object objNew;
        objNew = obj;
        return objNew;
    }
    public static void main(String[] args) {
        Singleton.getUniqueInstance();
        System.out.println(Singleton.getUniqueInstance());
        System.out.println(Singleton.getUniqueInstance());
        System.out.println(Singleton.getUniqueInstance());
        System.out.println(Singleton.getUniqueInstance());

        System.out.println("\n");

        Apple apple = new Apple();
        apple.setName("Granatnik");
        System.out.println(apple.getName());
        Apple apple1 = (Apple) apple.makeCopy();
        System.out.println(apple1.getName());

        System.out.println("\n");

        Main oldMain = new Main();
        try {
            Main objNew = (Main) Main.getNewClone(oldMain);
            System.out.println(objNew);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println(oldMain);
        }

        System.out.println("\n");

        Sedliak sedliak = new Sedliak();
        Bojovnik bojovnik = new Bojovnik();
        Director d1 = new Director(bojovnik);
        Director d2 = new Director(sedliak);
        d1.zlozPostavu();
        d1.vratPostavu().OpisSa();
        d2.zlozPostavu();
        d2.vratPostavu().OpisSa();

        System.out.println("\n");

        AbstractFactory factory1 = new ConcreteFactory1();
        AbstractFactory factory2 = new ConcreteFactory2();
        factory1.createProductA();
        factory2.createProductA();
        factory1.createProductB();
        factory2.createProductB();

        System.out.println("\n");

        Velkoobchod FRUIT = new VelkoobchodSOvocim();
        FRUIT.vytvorOvocie("Jablko").jem();
        FRUIT.vytvorOvocie("Pomaranc").jem();

        System.out.println("\n");

        Dalekohlad dalekohlad = new Dalekohlad(new Hviezda());
        dalekohlad.svetlo();

        System.out.println("\n");

        VelkoobchodFacade facade = new VelkoobchodFacade();
        facade.zakolkoKupimVsetkoVsklade();
        facade.kolkoJeOvocia();
        facade.donesOvocie();
        facade.kolkoJeOvocia();
        facade.ulozOvocie("Hruska");
        facade.kolkoJeOvocia();

        System.out.println("\n");

        Component component = new Mobil(new Peniaze(new Puska(new ConcreteComponent())));
        component.vypisCinnost();

        System.out.println("\n");

        Leaf leaf1 = new Leaf("Subor 1");
        Leaf leaf2 = new Leaf("Subor 2");
        Leaf leaf3 = new Leaf("Subor 3");
        Leaf leaf4 = new Leaf("Subor 4");
        Composite composite = new Composite("zlozka 1");
        composite.vlozDoZlozky(leaf1);
        composite.vlozDoZlozky(leaf2);
        composite.vlozDoZlozky(leaf3);

        System.out.println("meno: " + leaf4.getName() + "\npocet suborov: " + leaf4.spocitaj());
        System.out.println("meno: " + composite.getName() + "\npocet suborov: " + composite.spocitaj());

        System.out.println("\n");

        ProxyImage obrazok = new ProxyImage("HD_PICTURE");
        ProxyImage obrazok1 = new ProxyImage("FullHD_PICTURE");
        obrazok.displayImage();
        obrazok.displayImage();
        obrazok1.displayImage();
        obrazok1.displayImage();
        obrazok.displayImage();

        System.out.println("\n");

        FBIwebpage wwwFBIcom = new wwwFBIcom();
        FBIwebpage proxyServer = new ProxyMachine(wwwFBIcom);
        wwwFBIcom.access("Stevo");
        wwwFBIcom.request("pohodka...");
        wwwFBIcom.request("stahujem zo stranky... sa vola ze:");
        wwwFBIcom.request("megaupload");

        proxyServer.access("Stevo");
        proxyServer.request("pohodka...");
        proxyServer.request("stahujem zo stranky... sa vola ze:");
        proxyServer.request("megaupload");

        System.out.println("\n");

        Sklad skladisko = new SkladMisko(new SkladMatko(new SkladPeter(null)));
        skladisko.dodaj("Broskyna");


        System.out.println("\n");


        ZoznamZamestnancov zborovna = new ZoznamZamestnancov();
        zborovna.add(new Zamestnanec("Lubomir", "Lazor", 700));
        zborovna.add(new Zamestnanec("Paly", "Petrovsky", 800));
        zborovna.add(new Zamestnanec("Katarina", "Fedorova", 600));
        zborovna.add(new Zamestnanec("Anzka", "Richtarikova", 650));
        zborovna.add(new Zamestnanec("Jan", "Kanuk", 700));
        ConcreteIterator ite = (ConcreteIterator) zborovna.CreateIterator();
        ite.first();
        while (!ite.isDone()) {
            System.out.println("Meno: " + ite.currentItem().getName());
            System.out.println("Priezvisko: " + ite.currentItem().getPriezvisko());
            System.out.println("Plat: " + ite.currentItem().getPlat());
            ite.next();
        }


        System.out.println("\n");

        ConcreteObservable co=new ConcreteObservable();
        ConcreteObserverA A=new ConcreteObserverA(co);
        ConcreteObserverB B=new ConcreteObserverB(co);
        co.attach(A);
        co.attach(B);
        String sprava="ahoooj";
        co.setState(sprava);
        co.detach(B);
        sprava="caveees";
        co.setState(sprava);

        System.out.println("\n");


        Visitor visitorA = new ConcretevsitorA();
        Visitor visitorB = new ConcreteVisitorB();

        Element element1 = new ConcreteElement1("Element1");
        Element element2 = new ConcreteElement2("Element2");

        ArrayList<Element> zoznam = new ArrayList<>();
        zoznam.add(element1);
        zoznam.add(element2);

        for(Element e: zoznam){
            e.accept(visitorA);
        }

        for(Element e: zoznam){
            e.accept(visitorB);
        }



        System.out.println("\n");



        Context Robot1 = new Context();
        Strategy spravanie1 = new ConcreteStrategyA();
        Strategy spravanie2 = new ConcreteStrategyB();
        Strategy spravanie3 = new ConcreteStrategyC();

        Robot1.setName("ROBOT1");

        Robot1.setStrategy(spravanie1);
        Robot1.strategyBehavior();
        Robot1.setStrategy(spravanie2);
        Robot1.strategyBehavior();
        Robot1.setStrategy(spravanie3);
        Robot1.strategyBehavior();
    }

}
