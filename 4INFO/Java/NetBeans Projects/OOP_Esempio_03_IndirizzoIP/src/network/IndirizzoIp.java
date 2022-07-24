package network;

/**
 *
 * @author Giulio Angiani (IIS Pascal - Reggio Emilia)
 */
public class IndirizzoIp {

    private final int oct1;
    private final int oct2;
    private final int oct3;
    private final int oct4;
    private int nmbit = -1;
    
    private IndirizzoIp netmask = null;
    
    public IndirizzoIp(int i1, int i2, int i3, int i4) throws Exception {
        if (i1 < 0 || i1 > 255) throw new Exception("Octect1 value is out of range >> " + i1);
        if (i2 < 0 || i2 > 255) throw new Exception("Octect2 value is out of range >> " + i2);
        if (i3 < 0 || i3 > 255) throw new Exception("Octect3 value is out of range >> " + i3);
        if (i4 < 0 || i4 > 255) throw new Exception("Octect4 value is out of range >> " + i4);
        this.oct1 = i1;
        this.oct2 = i2;
        this.oct3 = i3;
        this.oct4 = i4;
    }

    public IndirizzoIp(int i1, int i2, int i3, int i4, int nmbit) throws Exception {
        this(i1, i2, i3, i4);
        this.nmbit = nmbit; 
    }
    
    public int getAmpiezzaRete() {
        return (int) Math.pow(2, 32-this.nmbit);
    }    

    public int getHostIndirizzabili() {
        return this.getAmpiezzaRete() - 2;
    }

    private Exception Exception(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public IndirizzoIp getNetmask() {
        return netmask;
    }

    public void setNetmask(IndirizzoIp netmask) {
        this.netmask = netmask;
    }
    
    public String bitRepresentation() {
        String oct1bit = Integer.toBinaryString(oct1);  // trasforma un decimale in binario
        String oct2bit = Integer.toBinaryString(oct2);
        String oct3bit = Integer.toBinaryString(oct3);
        String oct4bit = Integer.toBinaryString(oct4);
        // %8s fa il padding ad 8 caratteri di stringhe più corte
        // mette degli " " dove mancano i caratteri e quindi li sostituiamo con degli 0
        return String.format("%8s.%8s.%8s.%8s", oct1bit, oct2bit, oct3bit, oct4bit).replaceAll(" ", "0");  
    }

    public String toString() {
        return String.format("%d.%d.%d.%d", oct1, oct2, oct3, oct4);
    }
    
    public IndirizzoIp getNetAddress() throws java.lang.Exception {
        // calcolo della NA con IP e Netmask
        int oct1nm = this.netmask.oct1;
        int oct2nm = this.netmask.oct2;
        int oct3nm = this.netmask.oct3;
        int oct4nm = this.netmask.oct4;
        // bitwise fra interi 
        return new IndirizzoIp(oct1 & oct1nm, oct2 & oct2nm, oct3 & oct3nm, oct4 & oct4nm);
    }

    public IndirizzoIp getBroadCast() throws java.lang.Exception {
        return null;
    }
    
}
