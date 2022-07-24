package oop;

/**
 *
 * @author Giulio Angiani (IIS Pascal - Reggio Emilia)
 */
public class OOP_Esempio_01_PuntoCartesiano {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        PuntoCartesiano p0 = new PuntoCartesiano(5,3);
        System.out.println("p0 = " + p0);
        PuntoCartesiano p1 = new PuntoCartesiano(2,2);
        System.out.println("p1 = " + p1);
        System.out.println(p0.distanzaDaOrigine());
        System.out.println(p1.distanzaDaOrigine());
        
    }
    
}
