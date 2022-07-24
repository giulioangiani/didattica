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
class Vegetariana extends Pizza {

    public Vegetariana() {
        this.costo = 6;
    }  
     
    @Override
    public String toString() {
        return "Una Vegetariana";
    }    
    
}
