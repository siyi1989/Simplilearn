
package com.simplilearn.domain;
import com.simplilearn.domain.Employee;

public class EmployeeTest {
    public static void main(String[] args) {
//        Employee emp1 = new Employee(); Error , there is no default constructor
        Employee emp1 = new Employee(121, "Ron", "ab123", 4000);
        emp1.raiseSalary(1000);
        int employee_id = emp1.getEmpId();
        String employee_name  = emp1.getName();
        double salary = emp1.getSalary();
        String ssn = emp1.getSsn();
        System.out.println("Details of Employee");
        System.out.println("Name = " + employee_name + " ssn="+ssn);
    }
}
