/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compagniatelefonica;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author giulio
 */
public class MainCompagniaTelefonica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Cliente c = new Cliente("Francesca", "Bassani", "BSNFRN72A12H513E");
        c.setEmail("francesca.bassani@mymail.com");
        System.out.println("Cognome: " + c.getCognome());
        System.out.println("Nome: " + c.getNome());
        System.out.println("CF: " + c.getCodicefiscale());
        System.out.println("Email: " + c.getEmail());
        
        SIM s = new SIM("3339876543", 10.00);
        System.out.println("Numero: " + s.getNumero());
        System.out.println("Credito: " + s.getCreditoResiduo());
        s.ricaricaCredito(20.00);
        System.out.println("Credito (dopo la ricarica da 20€) : " + s.getCreditoResiduo());
        
        
        Telefonata t = new Telefonata("3339876543", "3331234667", "10:45", 10);
        System.out.println("Numero chiamante: " + t.getNumeroChiamante());
        System.out.println("Numero chiamato: " + t.getNumeroChiamato());
        System.out.println("Ora: " + t.getOra());
        System.out.println("Durata: " + t.getDurata());
        
        Messaggio m = new Messaggio("3339876543", "3331234667");
        m.setTesto("Ciao! Ci vediamo stasera alle 7 ?");
        m.setData("2020/07/01");
        m.setOra("11:30");        
        System.out.println("Numero invio     : " + m.getNumeroinvio());
        System.out.println("Numero ricezione : " + m.getNumeroricezione());
        System.out.println("Testo: " + m.getTesto());
        System.out.println("Data: " + m.getData());
        System.out.println("Ora: " + m.getOra());
        
        // gestione SIM
        // collego la sim s al cliente c
        SIM s1 = new SIM("3331234567", 10.00);
        SIM s2 = new SIM("3457172534", 20.00);
        c.aggiungiSIM(s1);
        c.aggiungiSIM(s2);
        // stampo i dati della sim del cliente
        for (SIM x : c.getSchedesim()) {
            System.out.println("Numero: " + x.getNumero());
            System.out.println("Credito: " + x.getCreditoResiduo());
            System.out.println("===========================================");
        }
        
        System.out.println("Proprietario di s1: " + s1.getCliente().getCognome());
        
    }
    
}
