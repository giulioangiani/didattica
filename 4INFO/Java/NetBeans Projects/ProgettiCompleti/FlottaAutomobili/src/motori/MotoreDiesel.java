package motori;
import errori.*;

/**
 *
 * @author Giulio Angiani (IIS Pascal - Reggio Emilia)
 */
public class MotoreDiesel extends Motore {

    public MotoreDiesel(int cilindrata, int rpm, int potenza) throws Exception {
        super(cilindrata, rpm, potenza);
        if (rpm > 8000) throw new RPM_not_valid_Exception();
        if (potenza > 200) throw new Potenza_not_valid_Exception();
        this.tipocarburante = "Diesel";
    }

    @Override
    public void setTipocarburante(String tipocarburante) {
        this.tipocarburante = "DIESEL";
    }
    
}
