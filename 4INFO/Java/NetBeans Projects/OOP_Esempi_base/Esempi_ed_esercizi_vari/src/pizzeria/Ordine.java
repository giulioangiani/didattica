/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzeria;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author giulio
 */
public class Ordine {

    private ArrayList<Pizza> listapizze = null;
    private Cliente cliente = null;
    private Date date = null;
    
    public Ordine() {
        this.listapizze = new ArrayList<Pizza>(); // la lista delle pizze esiste ma è vuota
    }

    public Ordine(Cliente c, Date d) {
        this.listapizze = new ArrayList<Pizza>(); // la lista delle pizze esiste ma è vuota
        this.cliente = c;
        this.date = d;
    }

    public void setCliente(Cliente c) {
        this.cliente = c;
    }

    public Cliente getCliente() {
        return cliente;
    }
    
    

    void setData(Date date) {
        this.date = date;
    }

    void addPizza(Pizza p) {
        this.listapizze.add(p);
    }

    public Iterable<Pizza> getPizze() {
        return this.listapizze;
    }

    public float getTotale() {
        System.out.println("quante" + this.listapizze.size());
        float tot = 0;
        for (Pizza tmp: this.listapizze) {
            tot += tmp.getCosto();
        }
        return tot;
    }
    
}
