package thi;

abstract public class SalaryPolicy {
     float baseSalary;
     public SalaryPolicy(float baseSalary){
         this.baseSalary=baseSalary;
     }
    abstract public float getSalary();
}
