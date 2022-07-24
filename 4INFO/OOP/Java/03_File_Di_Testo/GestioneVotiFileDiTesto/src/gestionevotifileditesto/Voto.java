/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionevotifileditesto;

/**
 *
 * @author giulio
 */
class Voto {

    private final String materia;
    private final float voto;
    private final String data;
    
    public Voto(String materia, float v, String data) {
        this.materia = materia;
        this.voto = v;
        this.data = data;
    }

    public String getMateria() {
        return materia;
    }

    public float getVoto() {
        return voto;
    }

    public String getData() {
        return data;
    }
    
}
