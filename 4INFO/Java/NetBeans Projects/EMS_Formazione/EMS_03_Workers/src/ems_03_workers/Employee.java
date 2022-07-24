package ems_03_workers;

/**
 *
 * @author Giulio Angiani (IIS Pascal - Reggio Emilia)
 */
public class Employee extends Worker {
    
    private String mobilePhone;

    public Employee(String mobilePhone, String name) {
        super(name);
        this.mobilePhone = mobilePhone;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    @Override
    public double getSalary() {
        return 1500;
    }
    
    
    
}
