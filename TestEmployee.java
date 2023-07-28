
package com.mycompany.testemployee;

public class TestEmployee {

    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setName("John");
        employee.setAge(30);
        employee.setSalary(50000.0);

        System.out.println("Employee Name: " + employee.getName());
        System.out.println("Employee Age: " + employee.getAge());
        System.out.println("Employee Salary: " + employee.getSalary());
    }
}

