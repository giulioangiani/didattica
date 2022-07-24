package network;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Giulio Angiani (IIS Pascal - Reggio Emilia)
 */
public class TestMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        IndirizzoIp ip1 = null;
        try {
            ip1 = new IndirizzoIp(192, 168, 1, 1);
        } catch (Exception ex) {
            System.out.println("Errore durante l'istanza dell'oggetto : " + ex.getMessage());
        }

        try {
            IndirizzoIp ip2 = new IndirizzoIp(192, 260, 1, 1);
        } catch (Exception ex) {
            System.out.println("Errore durante l'istanza dell'oggetto : " + ex.getMessage());
        }
        
        System.out.println("ip1 = " + ip1);
        
        IndirizzoIp ip3 = null;
        try {
            ip3 = new IndirizzoIp(192, 168, 1, 1, 24);
        } catch (Exception ex) {
            System.out.println("Errore durante l'istanza dell'oggetto : " + ex.getMessage());
        }
        System.out.println("getAmpiezzaRete = " + ip3.getAmpiezzaRete());
        System.out.println("getHostIndirizzabili = " + ip3.getHostIndirizzabili());
        
        // aggiungiamo la netmask
        IndirizzoIp netmask1;
        try {
            netmask1 = new IndirizzoIp(255,255,255,0);
            ip1.setNetmask(netmask1);
        } catch (Exception ex) {
            System.out.println("NetMask non valida : " + ex.getMessage());
        }
        
        System.out.println("Netmask di ip1 = " + ip1.getNetmask());

        System.out.println("Bit repr di ip1 = " + ip1.bitRepresentation());
        System.out.println("Bit repr di netmask = " + ip1.getNetmask().bitRepresentation());
        
        try {
            System.out.println("NetAddress di ip1 = " + ip1.getNetAddress());
        } catch (Exception ex) {
            System.out.println("Errore in generazione net address");
        }
        
        try {
            System.out.println("Broadcast di ip1 = " + ip1.getBroadCast());
        } catch (Exception ex) {
           System.out.println("Errore in calcolo del broadcast ");
        }
        
        
    }
    
}
