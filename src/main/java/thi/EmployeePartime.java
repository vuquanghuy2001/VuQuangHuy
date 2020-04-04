package thi;

public class EmployeePartime extends SalaryPolicy {
    private float rate;
    public EmployeePartime(float baseSalary){
        super(baseSalary);
        this.rate=(float)2.5;
    }

    @Override
    public float getSalary(){
        return rate*baseSalary;
    }
}
