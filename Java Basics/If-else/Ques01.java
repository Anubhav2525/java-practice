
// WAP to accept two integer and check they are equal or not
import java.util.Scanner;

public class Ques01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a == b)
            System.out.println("Equal");
        else
            System.out.println("Not equal");
        sc.close();
    }
}