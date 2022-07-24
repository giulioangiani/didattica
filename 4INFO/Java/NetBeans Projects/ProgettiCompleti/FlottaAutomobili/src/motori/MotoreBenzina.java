package motori;
import errori.*;
/**
 *
 * @author Giulio Angiani (IIS Pascal - Reggio Emilia)
 */
public class MotoreBenzina extends Motore {

    public MotoreBenzina(int cilindrata, int rpm, int potenza) throws Exception {
        super(cilindrata, rpm, potenza);
        if (rpm > 5000) throw new RPM_not_valid_Exception();
        if (potenza > 150) throw new Potenza_not_valid_Exception();
        this.tipocarburante = "Benzina";
    }

    @Override
    public void setTipocarburante(String tipocarburante) {
        this.tipocarburante = "BENZINA";
    }
    
}
