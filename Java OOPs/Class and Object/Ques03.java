//  Write a Java program to create a class called "Rectangle" with width and height attributes. Calculate the area and perimeter of the rectangle.

import java.util.Scanner;

class Rectangle {
    float width, height;
    Scanner sc = new Scanner(System.in);

    Rectangle() {
        System.out.print("Enter the width : ");
        this.width = sc.nextFloat();
        System.out.print("Enter the height : ");
        this.height = sc.nextFloat();
    }

    public void area() {
        System.out.println("Area of rectangle : " + (width * height));
    }

    public void perimeter() {
        System.out.println("Perimeter of rectangle : " + (2 * (width + height)));
    }
}

public class Ques03 {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        r1.area();
        r1.perimeter();
    }
}
