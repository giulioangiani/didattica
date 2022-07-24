package matematica;

/**
 *
 * @author Giulio Angiani (IIS Pascal - Reggio Emilia)
 */
public class MainNumeroRazionale {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        NumeroRazionale nr = new NumeroRazionale(2,3);
        System.out.println("nr = " + nr);
        
        //NumeroRazionale nr2 = new NumeroRazionale(2,0);
        //System.out.println("nr2 = " + nr2);
        
        System.out.println(nr.getNumeratore());
        System.out.println(nr.getDenominatore());
        System.out.println(nr.getValoreReale());
        
        NumeroRazionale i1 = nr.getInverso();
        System.out.println("i1=" + i1.getValoreReale());
        System.out.println("i1=" + i1);
        
        NumeroRazionale n = new NumeroRazionale(1320,999);
        System.out.println("(prima) n = " + n);
        n.riduciAiMinimiTermini();
        System.out.println("(dopo)  n = " + n);
        
        
        NumeroRazionale n1 = new NumeroRazionale(2,3);
        NumeroRazionale n2 = new NumeroRazionale(10,3);
        System.out.println("(prima)  n1 = " + n1);
        n1.add(n2);
        System.out.println("(dopo)   n1 = " + n1);
        
        NumeroRazionale n3 = new NumeroRazionale(2,3);
        NumeroRazionale n4 = new NumeroRazionale(3,4);
        System.out.println("(prima)  n3 = " + n3);
        n3.mult(n4);
        System.out.println("(dopo)   n3 = " + n3);

//        n1.mult(n2)
        
        
    }
    
}
