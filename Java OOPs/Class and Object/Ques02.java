// Write a Java program to create a class called "Dog" with a name and breed attribute. Create two instances of the "Dog" class, set their attributes using the constructor and modify the attributes using the setter methods and print the updated values.

import java.util.Scanner;

class Dog {
    String name, breed;
    Scanner sc = new Scanner(System.in);

    Dog() {
        System.out.println("Enter the name : ");
        this.name = sc.next();
        System.out.println("Enter the Breed : ");
        this.breed = sc.next();
    }

    public void setName() {
        System.out.println("Enter the new name : ");
        this.name = sc.next();
        System.out.println("Enter the new Breed : ");
        this.breed = sc.next();
    }

    public void getResult() {
        System.out.println("Updated Name : " + name);
        System.out.println("Updated Breed : " + breed);
    }

}

public class Ques02 {
    public static void main(String[] args) {
        // First object
        Dog d1 = new Dog();
        d1.setName();
        d1.getResult();
        // Second object
        Dog d2 = new Dog();
        d2.setName();
        d2.getResult();
    }
}
