/*
Basic Inheritance:

Create a class Animal with properties like name and age. Then, create two subclasses Dog and Cat that inherit from Animal. Implement methods like makeSound() that print out different sounds for each subclass.

*/

import java.util.Scanner;

class Animal {
    String name, age;
    Scanner scanner = new Scanner(System.in);

    Animal() {
        System.out.print("Enter the name : ");
        name = scanner.next();
        System.out.print("Enter the age : ");
        age = scanner.next();
    }
}

class Dog extends Animal {
    public void makeSound() {
        System.out.println("Bark");
    }
}

class Cat extends Animal {
    public void makeSound() {
        System.out.println("meows, chirrups, hisses, purrs, chatters, and growls,");
    }
}

public class Ques01 {
    public static void main(String[] args) {
        // Dog object
        Dog dog = new Dog();
        dog.makeSound();
        // Cat object
        Cat cat = new Cat();
        cat.makeSound();
    }
}