package animali;

/**
 *
 * @author Giulio Angiani (IIS Pascal - Reggio Emilia)
 */
public class Uccello extends Animale {

    private String piumaggio;
    private Double aperturaAlare;
    
    public Uccello(String co, Double p, Double lung, int ns, Double vm) {
        super(co, p, lung, ns, vm);
    }  
    
    public void setAperturaAlare(Double aa) {
        this.aperturaAlare = aa;
    }
    public void setPiumaggio(String p) {
        this.piumaggio = p;
    }

    public String getPiumaggio() {
        return piumaggio;
    }

    public Double getAperturaAlare() {
        return aperturaAlare;
    }
    
}
