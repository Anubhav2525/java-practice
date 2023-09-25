//WAp to check a number is divisible by 2
import java.util.Scanner;

public class Ques06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num=sc.nextInt(),next;
        if(num%2==0)
            System.out.println("The number is divisible by 2");
        else{
            next=num+(2-(num%2));
            System.out.println("The next term which is divisible by 2 : "+next);
        }
        sc.close();
    }
}
