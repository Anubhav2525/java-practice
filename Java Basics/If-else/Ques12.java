
//Wap to check voting
import java.util.Scanner;

public class Ques12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age : ");
        int age = sc.nextInt();
        if (age >= 18 && age < 100)
            System.out.println("You are eligible for voting");
        else
            System.out.println("You are not eligible for voting");
        sc.close();
    }
}
