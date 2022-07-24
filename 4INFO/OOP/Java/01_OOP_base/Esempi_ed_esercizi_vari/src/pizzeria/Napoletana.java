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
class Napoletana extends Pizza {

    
    public Napoletana() {
        this.costo = 4;
    }

    public Napoletana(String maionese) throws PizzaioloFuriosoException {
        throw new PizzaioloFuriosoException();
    }
    
    @Override
    public String toString() {
        return "Una Napoletana";
    }
    
}
