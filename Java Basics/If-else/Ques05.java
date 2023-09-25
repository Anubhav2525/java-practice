
//WAp to check a number is divisible by 5
import java.util.Scanner;

public class Ques05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        int next;
        if (num % 5 == 0)
            System.out.println("Number is divisible by 5");
        else {
            next = num + (5 - (num % 5));
            System.out.println("The next term which is divisible by 5 : "+next);
        }
        sc.close();
    }
}