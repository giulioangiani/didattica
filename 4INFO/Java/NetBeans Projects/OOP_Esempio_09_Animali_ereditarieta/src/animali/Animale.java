package animali;

/**
 *
 * @author Giulio Angiani (IIS Pascal - Reggio Emilia)
 */
public class Animale {    
    
    private String coloreOcchi;
    private Double peso;
    private Double lunghezza;
    private int numeroSensi;
    private Double velocitaMassima;    
    
    public Animale(String co, Double p, Double lung, int ns, Double vm) {
        this.coloreOcchi = co;
        this.peso = p;
        this.numeroSensi = ns;
        this.lunghezza = lung;
        this.velocitaMassima = vm;
    }

    public String getColoreOcchi() {
        return coloreOcchi;
    }

    public void setColoreOcchi(String coloreOcchi) {
        this.coloreOcchi = coloreOcchi;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Double getLunghezza() {
        return lunghezza;
    }

    public void setLunghezza(Double lunghezza) {
        this.lunghezza = lunghezza;
    }

    public int getNumeroSensi() {
        return numeroSensi;
    }

    public void setNumeroSensi(int numeroSensi) {
        this.numeroSensi = numeroSensi;
    }

    public Double getVelocitaMassima() {
        return velocitaMassima;
    }

    public void setVelocitaMassima(Double velocitaMassima) {
        this.velocitaMassima = velocitaMassima;
    }
    

    
}
