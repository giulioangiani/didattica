package ems;

import java.util.ArrayList;

/**
 *
 * @author Giulio Angiani (IIS Pascal - Reggio Emilia)
 */
public class SIM {
    
    private static int numeroSimPresenti = 0;
    
    private String numeroTelefono;
    protected double creditoResiduo;
    // lista delle telefonate
    private ArrayList<Telefonata> telefonate = new ArrayList<>();

    public SIM(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
        this.creditoResiduo = 0;
        SIM.numeroSimPresenti++;
    }

    public SIM(String numeroTelefono, double creditoResiduo) {
        this.numeroTelefono = numeroTelefono;
        this.creditoResiduo = creditoResiduo;
        SIM.numeroSimPresenti++;
    }

    @Override
    public String toString() {
        return "SIM{" + "numeroTelefono=" + numeroTelefono + ", creditoResiduo=" + creditoResiduo + '}';
    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public double getCreditoResiduo() {
        return creditoResiduo;
    }
    
    // ricarica credito
    public double ricaricaCredito(double ricarica) {
        // accetta ricarica solo di 10, 20 euro
        if ((ricarica != 10) && (ricarica != 20)) return this.creditoResiduo;
        //if (ricarica <= 0) return this.creditoResiduo;
        this.creditoResiduo += ricarica;
        return this.creditoResiduo;
    }

    public ArrayList<Telefonata> getTelefonate() {
        return telefonate;
    }
    
    public void chiama(String numero, int durata, String dataorachiamata) throws Exception {
        
        if (this.creditoResiduo < 0.1*durata) throw new Exception("Credito non sufficiente!");
        
        Telefonata t = new Telefonata(numero, dataorachiamata);
        t.setMinuti(durata);
        
        // assumendo che costi 10c al minuto
        this.creditoResiduo = this.creditoResiduo - 0.1*durata;
        
        telefonate.add(t);
    }

    public int getMinutiTotali() {
        int minutiTotali = 0;
        for (Telefonata t : this.telefonate) {
            minutiTotali += t.getMinuti();
        }
        return minutiTotali;
    }
    
    public static int getNumeroSimPresenti() {
        return SIM.numeroSimPresenti;
    }
    
    
}
