package animali;

/**
 *
 * @author Giulio Angiani (IIS Pascal - Reggio Emilia)
 */
public class Pesce extends Animale {

    
    private int numeroPinne;
    private String tipoAcqua; 

    public Pesce(String co, Double p, Double lung, int ns, Double vm) {
        super(co, p, lung, ns, vm);
    }
    public void setNumeroPinne(int np) {
        this.numeroPinne = np;
    }
    public void setTipoAcqua(String ta) {
        this.tipoAcqua = ta;
    }

    public int getNumeroPinne() {
        return numeroPinne;
    }

    public String getTipoAcqua() {
        return tipoAcqua;
    }

}
