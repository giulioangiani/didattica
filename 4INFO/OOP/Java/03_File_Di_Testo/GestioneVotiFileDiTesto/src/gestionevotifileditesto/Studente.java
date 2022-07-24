/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionevotifileditesto;

import java.util.ArrayList;
import java.util.Map.Entry;

/**
 *
 * @author giulio
 */
class Studente {
    
    private final String nome;
    private final String cognome;
    private final String matricola;
    private ArrayList<Voto> voti = null;

    Studente(String nome, String cognome, String matricola) {
        this.nome = nome;
        this.cognome = cognome;
        this.matricola = matricola;
        voti = new ArrayList<Voto>();
    }

    void addVoto(String materia, float voto, String data) {
        this.voti.add(new Voto(materia, voto, data));
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public String getMatricola() {
        return matricola;
    }

    public ArrayList<Voto> getVoti() {
        return voti;
    }
    
}
