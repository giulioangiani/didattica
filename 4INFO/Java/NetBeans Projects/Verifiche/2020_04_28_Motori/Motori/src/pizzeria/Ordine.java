/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzeria;

/**
 *
 * @author giulio
 */
class Ordine {
    
    String ingredienteaggiunto = null;
    Pizza pizza = null;
    String cliente;
    
    public Ordine(String cliente, Pizza p) {
        this.ingredienteaggiunto = "";
        this.pizza = p;
        this.cliente = cliente;
    }
    public Ordine(String cliente, Pizza p, String ingredienteaggiunto) throws PizzaioloFuriosoException {
        if (p instanceof Napoletana) {
            throw new PizzaioloFuriosoException();
        }
        this.ingredienteaggiunto = ingredienteaggiunto;
        this.pizza = p;
        this.cliente = cliente;
    }
}
