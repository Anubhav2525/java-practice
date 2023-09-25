
//WAp to check a number is divisible by 8
import java.util.Scanner;

public class Ques10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt(), next;
        if (num % 8 == 0)
            System.out.println("The number is divisible by 8");
        else {
            next = num + (8 - (num % 8));
            System.out.println("The next term which is divisible by 8 : " + next);
        }
        sc.close();
    }
}
