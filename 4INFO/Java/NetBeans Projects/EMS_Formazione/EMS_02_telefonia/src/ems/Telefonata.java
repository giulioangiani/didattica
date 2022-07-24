package ems;

/**
 *
 * @author Giulio Angiani (IIS Pascal - Reggio Emilia)
 */
public class Telefonata {
    private String numerochiamato;
    private String dataora;
    private int minuti;

    public Telefonata(String numerochiamato, String dataora) {
        this.numerochiamato = numerochiamato;
        this.dataora = dataora;
        this.minuti = 0;
    }

    public void setMinuti(int minuti) {
        if (minuti < 0) return;
        this.minuti = minuti;
    }

    public String getNumerochiamato() {
        return numerochiamato;
    }

    public String getDataora() {
        return dataora;
    }

    public int getMinuti() {
        return minuti;
    }

    @Override
    public String toString() {
        return "Telefonata{" + "numerochiamato=" + numerochiamato + ", dataora=" + dataora + ", minuti=" + minuti + '}';
    }
    
    
    
    
    
}
