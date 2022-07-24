package ems_01;

import java.util.Scanner;

/**
 *
 * @author Giulio Angiani (IIS Pascal - Reggio Emilia)
 */
public class EMS_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        int x = 1;
        int y = 2;
        int z = x+y;
        
        float r;
        boolean vf;
        String s = "Ciao a tutti";
        int[] vett = new int[10];
        int[] v = {8,2,5,4,3};
        
        System.out.println("z = " + z);
        for (int i = 0; i<5; i++)  {
            System.out.println("pos = " + i + " valore " + v[i]);
        }
        
        Scanner sc = new Scanner(System.in);
        System.out.print("inserisci il tuo nome: ");
        String nome = sc.nextLine();
        System.out.println("Ciao  " + nome);
        */
        PuntoDelPianoCartesiano p1 = new PuntoDelPianoCartesiano(2.5, 1.5);
        System.out.println("Distanza dal centro p1 = " + p1.calcolaDistanzaDallOrigine());
        PuntoDelPianoCartesiano p2 = new PuntoDelPianoCartesiano(4, -3);
        System.out.println("Distanza dal centro p2 = " + p2.calcolaDistanzaDallOrigine());
        System.out.println("Il punto p1 è in " + p1.getX() + ":" + p1.getY());
        p1.setX(7);
        System.out.println("Il punto p1 è in " + p1.getX() + ":" + p1.getY());
        p1.setX(-7);
        System.out.println("Il punto p1 è in " + p1.getX() + ":" + p1.getY());
        System.out.println("Il quadrante di p1 è " + p1.quadrante());
        System.out.println("Il quadrante di p2 è " + p2.quadrante());
        System.out.println("P1 = " + p1);
        PuntoDelPianoCartesiano p4 = new PuntoDelPianoCartesiano(1, 0);
        PuntoDelPianoCartesiano p5 = new PuntoDelPianoCartesiano(1, 0);
        System.out.println(p4.equals(p5));
    }
    
}
