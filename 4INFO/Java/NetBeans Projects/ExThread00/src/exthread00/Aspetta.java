package exthread00;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Giulio Angiani (IIS Pascal - Reggio Emilia)
 */
public class Aspetta {
    public static void wait(int delay) {
          int wait = (int)(Math.random()*2000) + delay;
          //System.out.println("Aspetta "  + wait);
          try {
              Thread.sleep(wait);
          } catch (Exception e) {
              
          }
        
    }
}
