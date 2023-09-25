import java.util.Scanner;

class Base {
    public int num1, num2;
    Scanner sc = new Scanner(System.in);

    Base() {
        System.out.print("Enter the first number : ");
        num1 = sc.nextInt();
        System.out.print("Enter the second number : ");
        num2 = sc.nextInt();
    }

    public void sum() {
        System.out.println("Sum = " + (num1 + num2));
    }
}

public class ConstructorFile {
    public static void main(String[] args) {
        Base obj = new Base();
        obj.sum();
    }
}
