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
class Margherita extends Pizza {
    
    private String ingrediente = null;
    
    public Margherita() {
        this.costo = 5;
    }

    public Margherita(String salsicce) {
        this.costo = 5;
        this.ingrediente = salsicce;
    }
    
    @Override
    public float getCosto() {
        if (this.ingrediente != null) {
            return super.getCosto()+1;
        }
        else {
            return super.getCosto();
        }
    }
    
    @Override
    public String toString() {
        
        if (this.ingrediente != null) {
            return "Una Margherita con " + ingrediente;
        }
        return "Una Margherita";
    }
    
}
