package ems_03_workers;

import java.util.ArrayList;

/**
 *
 * @author Giulio Angiani (IIS Pascal - Reggio Emilia)
 */
public class Azienda {
    private ArrayList<Worker> workers = new ArrayList<>();
    
    private String companyName;

    public Azienda(String companyName) {
        this.companyName = companyName;
    }   
    
    public void addWorker(Worker w) {
        this.workers.add(w);
    }
 
    public void printSalary() {
        for (Worker w: this.workers) {
            System.out.println("Stipendio di " + w.getName() + " (" + w.getClass().getSimpleName() + ") " + w.getSalary());
        }
    }    
    
}
