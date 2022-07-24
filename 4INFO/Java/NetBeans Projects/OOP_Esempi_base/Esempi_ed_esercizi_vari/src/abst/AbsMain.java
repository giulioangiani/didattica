/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abst;

import abst.Item.TipoItem;
import java.util.ArrayList;
import java.util.EnumMap;

/**
 *
 * @author giulio
 */
public class AbsMain {
        public enum DayOfWeek {
            MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
        }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ArrayList<Item> l = new ArrayList<Item>();
        
        //ERROR // Item is abstract; cannot be instantiated
        // Item i = new Item(100, "test");
        Articolo a1 = new Articolo(101, "monitor", 199.99, TipoItem.HARDWARE);
        Articolo a2 = new Articolo(102, "notebook", 399.99, TipoItem.HARDWARE);
        Articolo a3 = new Articolo(103, "McAfee", 99.99, TipoItem.SOFTWARE);
        Articolo a4 = new Articolo(104, "Portamonitor", 19.99, TipoItem.UFFICIO);
        System.out.println(a1.calculatePrice()); //Articolo is not abstract and does not override abstract method calculatePrice() in Item
        
        l.add(a1);
        l.add(a2);
        l.add(a3);
        l.add(a4);
        for (Item i : l) {
            System.out.println(i + " - € " + i.calculatePrice());
        }
        

        
        EnumMap<TipoItem, Double> ripartizione = new EnumMap<>(TipoItem.class);
        for (Item i : l) {
            if (!ripartizione.containsKey(i.getTipo())) {
                ripartizione.put(i.getTipo(), i.calculatePrice());
            }
            else {
                ripartizione.put(i.getTipo(), ripartizione.get(i.getTipo()) + i.calculatePrice());
            }
        }
        for (EnumMap.Entry<TipoItem, Double> entry : ripartizione.entrySet()) {
            System.out.println(entry.getKey() + " - € " + entry.getValue());
        }

        
    }
    
    
    
}
