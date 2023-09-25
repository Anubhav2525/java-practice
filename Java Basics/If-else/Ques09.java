
//WAp to check a number is divisible by 6
import java.util.Scanner;

public class Ques09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt(), next;
        if (num % 6 == 0)
            System.out.println("The number is divisible by 6");
        else {
            next = num + (6 - (num % 6));
            System.out.println("The next term which is divisible by 6 : " + next);
        }
        sc.close();
    }
}
