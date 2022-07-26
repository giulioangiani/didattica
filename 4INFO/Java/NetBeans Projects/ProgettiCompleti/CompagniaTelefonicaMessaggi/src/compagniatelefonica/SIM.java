package compagniatelefonica;

import java.util.ArrayList;
import java.util.List;

public class SIM {
    private String numero;

    private double creditoResiduo = 0;
    private Cliente cli = null;
    private List<Telefonata> telefonate;

    /**
     * Costruttore: prende in input numero di telefono della SIM
     */
    public SIM(String numero, double credito) {
        this.numero = numero;
        this.creditoResiduo = credito;
        this.telefonate = new ArrayList<Telefonata> ();
    }

    public String getNumero() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.numero;
    }

    public void setNumero(String numero) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.numero = numero;
    }

    public double getCreditoResiduo() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.creditoResiduo;
    }

    public void addTelefonata(Telefonata p1) {
        telefonate.add(p1);
    }

    public void ricaricaCredito(double ricarica) {
        this.creditoResiduo += ricarica;
    }
    
    public int getMinutiTotaliConversazione() {
        int result = 0;
        for (Telefonata x : this.telefonate) {
            result += x.getDurata();
        }
        return result;
    }
    
    public List<Telefonata> getTelefonate() {
        return this.telefonate;
    }

    public ArrayList<Telefonata> getListaTelefonatePerNumero(String numero) {
        ArrayList<Telefonata> result = new  ArrayList<>();
        for (Telefonata x : this.telefonate) {
            if (x.getNumeroChiamato().equals(numero)) result.add(x);
        }
        return result;
    }
    
    public void setCliente(Cliente c) {
        this.cli = c;
    }

    public Cliente getCliente() {
        return cli;
    }
}
