

//WAp to check a number is divisible by 10
import java.util.Scanner;

public class Ques04 {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt(), next;
        if (num % 10 == 0)
            System.out.println("The number is divisible by 10");
        else {
            next = num + (10 - (num % 10));
            System.out.println("The next term which is divisible by 10 : " + next);
        }
        sc.close();
    }
}
