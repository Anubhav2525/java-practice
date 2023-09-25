//WAp to check a number is divisible by 4
import java.util.Scanner;

public class Ques08 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt(), next;
        if (num % 4 == 0)
            System.out.println("The number is divisible by 4");
        else {
            next = num + (4 - (num % 4));
            System.out.println("The next term which is divisible by 4 : " + next);
        }
        sc.close();
    }
}
