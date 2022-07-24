package ems_03_workers;

/**
 *
 * @author Giulio Angiani (IIS Pascal - Reggio Emilia)
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Azienda a = new Azienda("EMS");
        a.addWorker(new Worker("Luca"));
        a.addWorker(new Employee("34567890", "Francesca"));
        a.addWorker(new WareHouseMan("Antonio"));
        a.addWorker(new Manager("9876542", "Luisa"));
        a.printSalary();
        
    }
    
}
