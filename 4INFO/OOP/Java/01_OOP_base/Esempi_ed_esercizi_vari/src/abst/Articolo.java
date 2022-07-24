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
public class Articolo extends Item {
    
    public Articolo(int code, String description, double price, TipoItem t) {
        super(code, description, price);
        this.t = t;
    }

    @Override
    public double calculatePrice() {
        // prezzo con iva 22% se Hardware o Sotfware
        // iva 10 se Ufficio
        double result = 0;
        switch (this.t) {
            case HARDWARE:
                result = this.getPrice() * 1.22;
                break;
            case SOFTWARE:
                result = this.getPrice() * 1.22;
                break;
            case UFFICIO:
                result = this.getPrice() * 1.10;
                break;
        }
        return result;
    }

    
    public String toString() {
        return "["+this.t+"] " + this.getDescription();
    }
    
    
    
}
