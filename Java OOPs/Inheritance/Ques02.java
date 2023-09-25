/*
Method Overriding:
Create a base class Shape with a method calculateArea(). Create subclasses Circle, Rectangle, and Triangle. Override the calculateArea() method in each subclass to calculate and return the area specific to that shape. 
*/

import java.util.Scanner;

class Shape {
    float radius, height, breadth;
    Scanner sc = new Scanner(System.in);

    public float calculateArea() {
        System.out.println("Calculate");
        return 0;
    }
}

class Circle extends Shape {
    public float calculateArea() {
        System.out.println("Circle .........");
        System.out.println("Enter the radius : ");
        radius = sc.nextFloat();
        System.out.println("Area of circle : " + (3.14 * radius * radius));
        return 0;
    }
}

class Rectangle extends Shape {
    public float calculateArea() {
        System.out.println("Rectangle ............");
        System.out.println("Enter the length : ");
        height = sc.nextFloat();
        System.out.println("Enter the width : ");
        breadth = sc.nextFloat();
        System.out.println("Area of rectangle : " + (height * breadth));
        return 0;
    }
}

class Triangle extends Shape {
    public float calculateArea() {
        System.out.println("Triangle .........");
        System.out.println("Enter the Height : ");
        height = sc.nextFloat();
        System.out.println("Enter the width : ");
        breadth = sc.nextFloat();
        System.out.println("Area of Triangle : " + (height * breadth) / 2);
        return 0;
    }
}

public class Ques02 {
    public static void main(String[] args) {
        // Shape Object
        Shape s1 = new Shape();
        s1.calculateArea();
        // Circle object
        Circle c1 = new Circle();
        c1.calculateArea();
        // Rectangle object
        Rectangle r1 = new Rectangle();
        r1.calculateArea();
        // Triangle object
        Triangle t1 = new Triangle();
        t1.calculateArea();
    }
}
