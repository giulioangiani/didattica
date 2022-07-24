package ems_03_workers;

/**
 *
 * @author Giulio Angiani (IIS Pascal - Reggio Emilia)
 */
public class Manager extends Employee {

    private String companyCarPlate;
    
    public Manager(String mobilePhone, String name) {
        super(mobilePhone, name);
    }

    public String getCompanyCarPlate() {
        return companyCarPlate;
    }

    public void setCompanyCarPlate(String companyCarPlate) {
        this.companyCarPlate = companyCarPlate;
    }
    

    @Override
    public double getSalary() {
        return 2000;
    }

    
    
}
