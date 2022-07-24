package CT;

/**
 *
 * @author Giulio Angiani (IFOA - Reggio Emilia)
 */
public class MainCT {

    
    public static void stampaFattura(Cliente c) {
        // stampa tutti i dati di quel cliente
        System.out.println("Cliente "  + c);
            System.out.println("==== LISTA SIM === ");
        for (SIM s : c.getListasim()) {
            System.out.println("SIM numero " + s.getNumero());
            System.out.println("credito € " + s.getCreditoResiduo());
            
            for (Item tmp : s.getItems()) {
                System.out.println(tmp.getClass());
                System.out.println(" Ore " + tmp.getOra() + " del " + tmp.getData());
                System.out.println(" " + tmp.getNumeroinvio() + " > " + tmp.getNumeroricezione());

                if (tmp instanceof Messaggio) {
                    System.out.println(" Testo : " + ((Messaggio)tmp).getTesto());
                }

                if (tmp instanceof Telefonata) {
                    System.out.println(" Durata : " + ((Telefonata)tmp).getDurata());
                }
                
                System.out.println();

            }          
            System.out.println("================================\n");
            
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cliente c1 = new Cliente("Giulio", "Angiani", "NGNGLI393343B");
        Cliente c2 = new Cliente("Sergio", "Masiello", "MSLCRG37E87293", "sergio.masiello.99@gmail.com");
        
        System.out.println("C1");
        System.out.println(c1.getNome());
        System.out.println(c1.getCognome());
        System.out.println(c1.getCf());
        System.out.println(">>"+c1.getEmail()+"<<");
        c1.setEmail("giulio.angiani@gmail.com");
        System.out.println(">>"+c1.getEmail()+"<<");
        

        System.out.println("C2");
        System.out.println(c2.getNome());
        System.out.println(c2.getCognome());
        System.out.println(c2.getCf());
        System.out.println(c2.getEmail());

        String numerotelefono1 = "32749837";
        String numerotelefono2 = "333123455";
        String numerotelefono3 = "9876543";
        
        
        SIM s1 = new SIM(numerotelefono1, 30);
        System.out.println("SIM s1 = " + s1);
        
        c2.aggiungiSim(s1);
    //    s1.setProprietario(c2);
        System.out.println("Lista sim di Sergio " + c2.getListasim());
        
        SIM s2 = new SIM(numerotelefono3, 50);
        c2.aggiungiSim(s2);
    //    s2.setProprietario(c2);
        System.out.println("Lista sim di Sergio " + c2.getListasim());
        
        for (SIM tmp : c2.getListasim()) {
            System.out.println("NUMERO " + tmp.getNumero());
            System.out.println("Credito Residuo € " + tmp.getCreditoResiduo());
            System.out.println("===================");
        }

        
        Messaggio m = new Messaggio(numerotelefono1, numerotelefono2);
        m.setData("2020-09-01");
        m.setOra("10:25");
        m.setTesto("Buon nuovo anno scolastico!");
        System.out.println("Messaggio: " + m.getTesto());
        System.out.println("Inviato alle " + m.getOra() + " del " + m.getData());
        System.out.println(m.getNumeroinvio() + ">" + m.getNumeroricezione());
        
        Telefonata t = new Telefonata(numerotelefono1, numerotelefono2);
        t.setData("2020-09-01");
        t.setOra("10:25");
        t.setDurata(20);
        System.out.println("Telefonata effettutata alle " + t.getOra() + " del " + t.getData());
        System.out.println(t.getNumeroinvio() + " > " + t.getNumeroricezione());
        System.out.println("Durata " + t.getDurata() + " secondi");
        
        
        s1.addItem(m);
        s1.addItem(t);
        s1.inviaSMS(s2, "2020-09-01", "15:30", "Un nuovo messaggio per te");
        System.out.println("Credito Residuo € " + s1.getCreditoResiduo());
        


        
//        Item i = new Item("23751263", "283279329");
//        s2.addItem(i);

        System.out.println("Da " + s1 + " di " + s1.getProprietario());
        for (Item tmp : s1.getItems()) {
//            System.out.println("item " + tmp);
            System.out.println("Ore " + tmp.getOra() + " del " + tmp.getData());
            System.out.println(tmp.getNumeroinvio() + " > " + tmp.getNumeroricezione());
            
            
            
            if (tmp instanceof Messaggio) {
                System.out.println("Testo : " + ((Messaggio)tmp).getTesto());
            }
            
            if (tmp instanceof Telefonata) {
                System.out.println("Durata : " + ((Telefonata)tmp).getDurata());
            }
            
        }
        
        
        System.out.println("\n\n================================\n\n");
        stampaFattura(c2);
        
    }
    
}
