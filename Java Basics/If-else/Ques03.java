
// WAP to check a number is positive or negative
import java.util.Scanner;

public class Ques03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter the number : ");
        int num = sc.nextInt();
        if (num > 0)
            System.out.println("Positive Number");
        else
            System.out.println("Negative Number");
        sc.close();
    }
}
