package thi;

import java.util.Scanner;

public class TestSalaryPolicy {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter your base salary fulltime: ");
        float baseSalary_fulltime=input.nextFloat();
        SalaryPolicy sp1=new EmployeeFullTime(baseSalary_fulltime);

        System.out.println("enter your base salary parttime: ");
        float baseSalary_parttime=input.nextFloat();
        SalaryPolicy sp2=new EmployeePartime(baseSalary_parttime);

        System.out.println("part-time employee salary "+sp2.getSalary());

        System.out.println("full-time employee salary "+sp1.getSalary());
    }
}
