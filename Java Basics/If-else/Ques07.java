
//WAp to check a number is divisible by 3
import java.util.Scanner;

public class Ques07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt(), next;
        if (num % 3 == 0)
            System.out.println("The number is divisible by 3");
        else {
            next = num + (3 - (num % 3));
            System.out.println("The next term which is divisible by 3 : " + next);
        }
        sc.close();
    }
}
