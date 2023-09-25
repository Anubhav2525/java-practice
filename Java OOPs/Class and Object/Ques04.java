//  Write a Java program to create a class called "Employee" with a name, job title, and salary attributes, and methods to calculate and update salary.

import java.util.Scanner;

class Employee{
    String name,jobTitle;
    float salary,totalSalary;
    Scanner sc= new Scanner(System.in);

    Employee(){
        System.out.print("Enter the name : ");
        name=sc.next();
        System.out.print("Enter the job title : ");
        jobTitle=sc.next();
        System.out.print("Enter the salary : ");
        salary=sc.nextFloat();
    }
    public void calculate(){
        totalSalary=salary*30;
    }
    public void updateSalary(){
        System.out.println("Enter the new salary : ");
        totalSalary=sc.nextFloat();
    }
    public void showDetails(){
        System.out.println("Name : "+name);
        System.out.println("Job Title : "+jobTitle);
        System.out.println("Old Salary : "+salary*30);
        System.out.println("New Salary : "+totalSalary);
    }
}

public class Ques04 {
    public static void main(String[] args) {
        Employee e1=new Employee();
        e1.calculate();
        e1.updateSalary();
        e1.showDetails();
    }
}
