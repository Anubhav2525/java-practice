
// WAP to accept the name,roll, and marks of three subject and calculate percentage, total marks and division
import java.util.Scanner;

public class Ques17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;
        int roll;
        float marks1, marks2, marks3, total, percent;
        System.out.println("Enter your name : ");
        name = sc.next();
        System.out.println("Enter roll number : ");
        roll = sc.nextInt();
        System.out.println("Enter the marks of three subjects  : ");
        marks1 = sc.nextFloat();
        marks2 = sc.nextFloat();
        marks3 = sc.nextFloat();
        total = marks1 + marks2 + marks3;
        percent = ((total / 300) * 100);
        System.out.println("Name : " + name);
        System.out.println("Roll Number : " + roll);
        System.out.println("Marks : " + marks1 + " " + marks2 + " " + marks3);
        System.out.println("Total Marks : " + total);
        System.out.println("Percentage : " + percent);
        if (percent > 90 && percent <= 100)
            System.out.println("Division : A++");
        else if (percent > 80 && percent <= 90)
            System.out.println("Division : A+");
        else if (percent > 70 && percent <= 80)
            System.out.println("Division : B+");
        else if (percent > 60 && percent <= 70)
            System.out.println("Division : B");
        else if (percent > 50 && percent <= 60)
            System.out.println("Division : C+");
        else if (percent > 40 && percent <= 50)
            System.out.println("Division : C");
        else if (percent > 10 && percent <= 40)
            System.out.println("You are Fail");
        sc.close();
    }
}
