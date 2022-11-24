package org.example;

public class EmployeeTest {

    public static void main(String args[]){
        Employee emp1 = new Employee();
        Employee emp2 = new Employee();
        Employee emp3 = new Employee();
        Employee emp4 = new Employee();

        emp1.setEmpName("Raj");
        emp1.setEmpId("101");
        emp1.setDesignation("manager");
        emp1.setHoursWorked(120);
        emp1.setSalary();

        System.out.println(emp1);
    }
}
