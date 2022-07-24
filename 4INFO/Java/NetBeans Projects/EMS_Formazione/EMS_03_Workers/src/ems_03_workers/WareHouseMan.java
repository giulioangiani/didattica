package ems_03_workers;

/**
 *
 * @author Giulio Angiani (IIS Pascal - Reggio Emilia)
 */
public class WareHouseMan extends Worker {

    public boolean forkLiftLicense = false;
    
    public WareHouseMan(String name) {
        super(name);
    }

    public boolean hasForkLiftLicense() {
        return forkLiftLicense;
    }

    public void setForkLiftLicense(boolean forkLiftLicense) {
        this.forkLiftLicense = forkLiftLicense;
    }

    @Override
    public double getSalary() {
        return 1300;
    }
    
    
    
}
