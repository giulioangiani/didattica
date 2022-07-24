package compagniatelefonica;

import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author Giulio Angiani (IIS Pascal - Reggio Emilia)
 */
public class Cliente {
    
    private final String nome;
    private final String cognome;
    private final String codicefiscale;
    private String email = "";
    
    public Cliente(String n, String c, String cf) {
        this.nome = n;
        this.cognome = c;
        this.codicefiscale = cf;
        
        this.schedesim = new ArrayList<SIM>();
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public String getCodicefiscale() {
        return codicefiscale;
    }

    public String getEmail() {
        return email;
    }
    
    // GESTIONE SIM
    private ArrayList<SIM> schedesim;
    
    public void aggiungiSIM(SIM s) {
        this.schedesim.add(s);
        s.setCliente(this);
    }

    public ArrayList<SIM> getSchedesim() {
        return this.schedesim;
    }    
    
}
