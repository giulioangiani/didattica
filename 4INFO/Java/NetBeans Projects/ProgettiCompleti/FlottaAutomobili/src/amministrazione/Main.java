package amministrazione;
import java.util.ArrayList;
import motori.*;
import errori.*;
import auto.*;
import java.util.Scanner;
/**
 *
 * @author Giulio Angiani (IIS Pascal - Reggio Emilia)
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        ArrayList<Automobile> flotta = new ArrayList<Automobile>();
        ArrayList<Motore> listamotori = new ArrayList<Motore>();
        
        MotoreBenzina mb1 = new MotoreBenzina(2000, 3000, 100);
        MotoreBenzina mb2 = new MotoreBenzina(8000, 5000, 150);
        try {
            MotoreBenzina mberr = new MotoreBenzina(4, -2, 200); //<== rpm non valido
        }
        catch (Cilindrata_not_valid_Exception e) {
            System.out.println("errore: La cilindrata non è corretta");
        }
        catch (FlottaAutomobiliGenericException e) {
            System.out.println("errore generico applicazione:" + e.getMessage());
        }
        catch (Exception e) {
            System.out.println("errore generico:" + e.getMessage());
        }
        // MotoreDiesel mderr = new MotoreDiesel(6000, 3000, 200); ; <== rpm non valido
        MotoreDiesel md1 = new MotoreDiesel(3000, 3000, 200); 
        
        MotoreDiesel2500 md2500 = new MotoreDiesel2500(600, 180);
        
        listamotori.add(mb1);
        listamotori.add(mb2);
        listamotori.add(md1);
        listamotori.add(md2500);
        
        Automobile a1 = new Automobile("FIAT","500",mb1);
        Berlina b1 = new Berlina("Ferrari", "F40", mb2);
        Optional o1 = new Optional("O11", "Telecamera posteriore", 150.00);
        Optional o2 = new Optional("O12", "Sedili riscaldati", 100.00);
        Optional o3 = new Optional("O13", "Cerchi in lega", 300.00);
        Optional o4 = new Optional("O14", "Nav kit", 300.00);
        Optional o5 = new Optional("O15", "Climatronic", 520.00);
        Optional o6 = new Optional("O16", "Vetri oscurati", 250.00);
        
        // aggiungo optional all'automobile a1
        
        a1.addOptional(o1);
        a1.addOptional(o2);
        a1.addOptional(o3);
        a1.addOptional(o4);
        a1.addOptional(o5);
        System.out.println("Optional di " + a1);
        for (Optional o : a1.getOptional()) {
            System.out.println("  " + o);
        }
        try {
            a1.addOptional(o6);
        }
        catch (TooManyOptionalError e) {
            System.out.println("Attenzione: Puoi inserire al massimo 5 Optional ");
        }
        
         
        // INTERFACCIA TESTUALE
        int cilindrata;
        int rpm;
        int potenza;
        int index;
        String marca;
        String modello;
        
        while (true) {
            System.out.println("\n\nMenu comandi\n");
            System.out.println("F - Inserisci nuovo motore benzina");
            System.out.println("D - Inserisci nuovo motore diesel");
            System.out.println("M - Visualizza lista motori");
            System.out.println("A - Inserisci nuova auto basic");
            System.out.println("B - Inserisci nuova berlina");
            System.out.println("C - Inserisci nuova coupè");
            System.out.println("V - Visualizza lista automobili");
            System.out.println("\nX - Esci");
            
            Scanner sc = new Scanner(System.in);
            String choice = sc.nextLine();
            
            
            switch (choice) {
                case "F":
                    System.out.println("Inserimento motore benzina:");
                    System.out.print("Cilindrata :"); cilindrata = Integer.parseInt(sc.nextLine());
                    System.out.print("RPM :"); rpm = Integer.parseInt(sc.nextLine());
                    System.out.print("Potenza :"); potenza = Integer.parseInt(sc.nextLine());
                    listamotori.add(new MotoreBenzina(cilindrata, rpm, potenza));
                    break;
                case "D":
                    System.out.println("Inserimento motore diesel:");
                    System.out.print("Cilindrata :"); cilindrata = Integer.parseInt(sc.nextLine());
                    System.out.print("RPM :"); rpm = Integer.parseInt(sc.nextLine());
                    System.out.print("Potenza :"); potenza = Integer.parseInt(sc.nextLine());
                    listamotori.add(new MotoreDiesel(cilindrata, rpm, potenza));
                    break;
                case "M":
                    System.out.println("Lista motori presenti:");
                    for (Motore m: listamotori) {
                        System.out.println("  " + m);
                    }
                    break;

                case "V":
                    System.out.println("Lista automobili nella flotta:");
                    for (Automobile m: flotta) {
                        System.out.println(" " + m);
                    }
                    break;

                case "A":
                    System.out.println("Inserimento nuova auto basic:");
                    System.out.print("Marca :"); marca = sc.nextLine();
                    System.out.print("Modello :"); modello = sc.nextLine();
                    System.out.println("Lista motori presenti:");
                    index = 0;
                    for (Motore m: listamotori) {
                        System.out.println(" " + index + ") " + m);
                        index++;
                    }
                    System.out.print("Seleziona il motore dalla lista :"); index = Integer.parseInt(sc.nextLine());
                    Motore motoreselezionato = listamotori.get(index);
                    Automobile a = new Automobile(marca, modello, motoreselezionato);
                    flotta.add(a);
                    break;

                case "B":
                    System.out.println("Inserimento nuova auto berlina:");
                    System.out.print("Marca :"); marca = sc.nextLine();
                    System.out.print("Modello :"); modello = sc.nextLine();
                    System.out.println("Lista motori presenti:");
                    index = 0;
                    for (Motore m: listamotori) {
                        System.out.println(" " + index + ") " + m);
                        index++;
                    }
                    System.out.print("Seleziona il motore dalla lista :"); index = Integer.parseInt(sc.nextLine());
                    Motore motoreselezionatob = listamotori.get(index);
                    Berlina b = new Berlina(marca, modello, motoreselezionatob);
                    flotta.add(b);
                    break;
                    
                case "C":
                    System.out.println("Inserimento nuova auto coupè:");
                    System.out.print("Marca :"); marca = sc.nextLine();
                    System.out.print("Modello :"); modello = sc.nextLine();
                    System.out.println("Lista motori presenti:");
                    index = 0;
                    for (Motore m: listamotori) {
                        System.out.println(" " + index + ") " + m);
                        index++;
                    }
                    System.out.print("Seleziona il motore dalla lista :"); index = Integer.parseInt(sc.nextLine());
                    Motore motoreselezionatoc = listamotori.get(index);
                    Coupe c = new Coupe(marca, modello, motoreselezionatoc);
                    flotta.add(c);
                    break;
                    
                case "X":
                    System.exit(0);
                
            }
            
        }
    }
    
}
