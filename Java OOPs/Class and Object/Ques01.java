// Write a Java program to create a class called "Person" with a name and age attribute. Create two instances of the "Person" class, set their attributes using the constructor, and print their name and age.

import java.util.Scanner;

class Person {
    String name, age;
    Scanner sc = new Scanner(System.in);

    Person() {
        System.out.print("Enter your name : ");
        name = sc.next();
        System.out.print("Enter your age : ");
        age = sc.next();
    }
}

public class Ques01 {
    public static void main(String[] args) {
        Person p1 = new Person();
        System.out.println(p1.name);
        System.out.println(p1.age);
        Person p2 = new Person();
        System.out.println(p2.name);
        System.out.println(p2.age);
    }
}
