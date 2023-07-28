package com.mycompany.testemployee1;
public class TestEmployee1 
{

   public class TestEmployee {
    public static void main(String[] args) {
        Employee bogdan = new Employee();
        bogdan.setEmpID(1);
        bogdan.setEmpName("Mr. Bogdan");
        bogdan.setEmpDesignation("Software Engineer");

        Employee bird = new Employee();
        bird.setEmpID(2);
        bird.setEmpName("Ms. Bird");
        bird.setEmpDesignation("Product Manager");

        System.out.println("Details of Mr. Bogdan:");
        System.out.println("Employee ID: " + bogdan.getEmpID());
        System.out.println("Employee Name: " + bogdan.getEmpName());
        System.out.println("Employee Designation: " + bogdan.getEmpDesignation());

        System.out.println("\nDetails of Ms. Bird:");
        System.out.println("Employee ID: " + bird.getEmpID());
        System.out.println("Employee Name: " + bird.getEmpName());
        System.out.println("Employee Designation: " + bird.getEmpDesignation());
    }


   }
}
