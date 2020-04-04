package thi;

public class EmployeeFullTime extends SalaryPolicy {
    private float rate;
    public EmployeeFullTime(float baseSalary){
        super(baseSalary);
        this.rate=(float)4;
    }
    @Override
    public float getSalary() {
        return rate*baseSalary;
    }
}
