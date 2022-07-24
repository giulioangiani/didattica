/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abst;

/**
 *
 * @author giulio
 */
abstract class Item {
    
    private int code;
    private String description;
    private double price;
    protected TipoItem t;

    public TipoItem getTipo() {
        return this.t;
    }
    
    public enum TipoItem {
       NONE,
       HARDWARE,
       SOFTWARE,
       UFFICIO
    };
    
    {   // inizializzazione di istanza
        this.t = TipoItem.NONE;
        
    }
    
    public Item(int code, String description, double price) {
        this.code = code;
        this.description = description;
        this.price = price;
    }


    public double getPrice() {
        return this.price;
    }
    
    public abstract double calculatePrice();
    public abstract String toString();

    public String getDescription() {
        return description;
    }
    
}
