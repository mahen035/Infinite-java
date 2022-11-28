package org.example;

public class SalaryCalTest {
    public static void main(String args[]){
        PermanentEmp emp1 = new PermanentEmp();

        emp1.setSalary(10000);
        emp1.setPfPercent(12);

       emp1.calNetSalary();

        System.out.println("Net Salary after deducting the PF is: "+emp1.getNetSalary());
    }
}
