import java.util.Scanner;

public class problem3 {
    // Employee Name, Employee Id, Salary, Department Name, and Designation
    public static void main(String[] args) {
       print();
    }

  public  static void print() {
        Scanner vv = new Scanner(System.in);
        System.out.println("Enter the Employee Name");
        String name = vv.next();
        System.out.println("Enter the Employee Id");
        long empId = vv.nextLong();
        System.out.println("Enter the Salary");
        long salary = vv.nextLong();
        System.out.println("Enter the Department Name");
        String deptName = vv.next();
        System.out.println("Enter the Designation");
        String designatio = vv.next();
        vv.close();
        System.out.println("The details of the entered employee are:");
        System.out.println(name);
        System.out.println(empId);
        System.out.println(salary);
        System.out.println(deptName);
        System.out.println(designatio);

    }
}
