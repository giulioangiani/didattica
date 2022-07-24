package ems;

import java.util.ArrayList;

/**
 *
 * @author Giulio Angiani (IIS Pascal - Reggio Emilia)
 */
public class Cliente {
    private final String nome;
    private final String cognome;
    private final String codicefiscale;
    private String email = "";
    
    private ArrayList<SIM> sim = new ArrayList<SIM>();
    
    public Cliente(String n, String c, String cf) {
        this.nome = n;
        this.cognome = c;
        this.codicefiscale = cf;
    }
    public void setEmail(String email) {    // unica "set" essendo gli altri attributi "final"
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

    @Override
    public String toString() {
        return "Cliente{" + "nome=" + nome + ", cognome=" + cognome + ", codicefiscale=" + codicefiscale + ", email=" + email + '}';
    }
    
    public void aggiungiSIM(SIM s1) {
        sim.add(s1);
    }

    public ArrayList<SIM> getSim() {
        return sim;
    }
    
    public ArrayList<Telefonata> getTutteTelefonate() {
        ArrayList<Telefonata> tmp = new ArrayList<Telefonata>();
        for (SIM s : sim) {
            for (Telefonata t : s.getTelefonate()) {
                tmp.add(t);
            }
        }
        return tmp;
    }
    
    
}