/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stampaetichette;

import java.util.ArrayList;

/**
 *
 * @author giulio
 */
class Cliente {
    
    private final String nome;
    private final String cognome;
    private final String partitaIva;
    private String ragioneSociale;
    private String sedeSociale;
    private float fatturato;
    private ArrayList<String> ambiti;

    public Cliente(String nome, String cognome, String partitaIva) {
        this.nome = nome;
        this.cognome = cognome;
        this.partitaIva = partitaIva;
        this.ambiti = new ArrayList<>();
    }

    void setRagioneSociale(String ragioneSociale) {
        this.ragioneSociale = ragioneSociale;
    }

    void setFatturato(float fatturato) {
        this.fatturato = fatturato;
    }

    void addAmbito(String a) {
        this.ambiti.add(a);
    }

    String getRagioneSociale() {
        return this.ragioneSociale;
    }

    String getCognome() {
        return this.cognome;
    }

    String getNome() {
        return this.nome;
    }

    String getPartitaIva() {
        return this.partitaIva;
    }

    float getFatturato() {
        return this.fatturato;
    }

    Iterable<String> getAmbiti() {
        return this.ambiti;
    }

    void setSedeSociale(String citta) {
        this.sedeSociale = citta;
    }
    
    String getSedeSociale() {
        return this.sedeSociale;
    }
    
    
}
