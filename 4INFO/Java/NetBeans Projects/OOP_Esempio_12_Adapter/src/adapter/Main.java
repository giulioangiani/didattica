package adapter;

import java.util.Scanner;
import people.Person;

/**
 *
 * @author Giulio Angiani (IIS Pascal - Reggio Emilia)
 */
public class Main {

    public static boolean checkPassword(Utente u, String pwd) {
        return u.getPassword().equals(pwd);
    }
     
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Utente u = new Utente("Lucia", "Rossi", "lulu");
        
        
        String pass = "ciccio";
        
        if(checkPassword(u, pass)) {
            System.out.println("Utente riconosciuto");
        }
        else {
            System.out.println("Utente non riconosciuto");
        }


        
        Person p = new Person("John", "Lennon");
        p.setPassword("imagine");
        Scanner in = new Scanner(System.in);
        System.out.print("Insert new password: ");
        String mypass = in.nextLine();
        
        UtentePersonAdapter upa = new UtentePersonAdapter(p);
        if(checkPassword(upa, mypass)) {
            System.out.println("1) Utente riconosciuto");
        }
        else {
            System.out.println("2) Utente non riconosciuto");
        }

        
    }
    
}
