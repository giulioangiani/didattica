package ems;

import java.util.ArrayList;

/**
 *
 * @author Giulio Angiani (IIS Pascal - Reggio Emilia)
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        SIM s1 = new SIM("3456789011", 30);
        SIM s2 = new SIM("3478762551");
        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);
        System.out.println("s1 = " + s1.getNumeroTelefono());
        System.out.println("s1 = " + s1.getCreditoResiduo());
        s1.ricaricaCredito(20);
        System.out.println("s1 = " + s1.getCreditoResiduo());
        s1.ricaricaCredito(15);
        System.out.println("s1 = " + s1.getCreditoResiduo());
        
        /*****************************/
        Telefonata t1 = new Telefonata("3214567890", "2021-05-27 11:48:00");
        System.out.println("t1 = " + t1);
        t1.setMinuti(20);
        System.out.println("t1 = " + t1);
        t1.setMinuti(-5);
        System.out.println("t1 = " + t1);
        System.out.println("telefonate uscite da s1 " + s1.getTelefonate());
        
        try {
            s1.chiama("329876535", 15, "2021-05-27 12:00:00");
        }
        catch(Exception e) {
            System.out.println("Errore: " + e.getMessage());
        }
        
        System.out.println("telefonate uscite da s1 " + s1.getTelefonate());
        System.out.println("credito s1 = " + s1.getCreditoResiduo());
        
        try {
            s1.chiama("333333535", 12, "2021-05-27 11:00:00");
        }
        catch(Exception e) {
            System.out.println("Errore: " + e.getMessage());
        }

        
        
        System.out.println("telefonate uscite da s1 " + s1.getTelefonate());

        System.out.println("credito s1 = " + s1.getCreditoResiduo());
        
        try {
            s1.chiama("333333535", 500, "2021-05-27 11:00:00");
        }
        catch(Exception e) {
            System.out.println("Errore: " + e.getMessage());
        }

        System.out.println("telefonate uscite da s1");
        
        for (Telefonata t : s1.getTelefonate()) {
            System.out.println("Da : " + s1.getNumeroTelefono());
            System.out.println("A  : " + t.getNumerochiamato());
            System.out.println("Data e ora  : " + t.getDataora());
            System.out.println("Durata  : " + t.getMinuti());
            System.out.println("==");
        }
        
        System.out.println("==========================");
        System.out.println("Minuti totali di s1 " + s1.getMinutiTotali());
        s2.ricaricaCredito(20);
        s2.chiama("4324676888", 10, "2021-01-10 15:15:15");
        System.out.println("Minuti totali di s2 " + s2.getMinutiTotali());
        
        System.out.println("==========================");
        Cliente c1 = new Cliente("Lucia", "Bianchi", "BNCLCI01A01H000H");
        System.out.println("c1 = " + c1);
        c1.aggiungiSIM(s1);
        c1.aggiungiSIM(s2);
        System.out.println("sim di c1 " + c1.getSim());
        
        ArrayList<Telefonata> tutte_le_telefonate = c1.getTutteTelefonate();

        for (Telefonata t : tutte_le_telefonate) {
            System.out.println("Da : " + s1.getNumeroTelefono());
            System.out.println("A  : " + t.getNumerochiamato());
            System.out.println("Data e ora  : " + t.getDataora());
            System.out.println("Durata  : " + t.getMinuti());
            System.out.println("==");
        }
        
        System.out.println("SIM Presenti " + SIM.getNumeroSimPresenti());

        Sim5G s5g = new Sim5G("7655425666", 100, "Vodafone");
        System.out.println("SIM Presenti " + Sim5G.getNumeroSimPresenti());
        System.out.println("Sim 5G credito " + s5g.getCreditoResiduo());
        s5g.ricaricaCredito(10);
        System.out.println("Sim 5G credito " + s5g.getCreditoResiduo());
        
    }
    
}
