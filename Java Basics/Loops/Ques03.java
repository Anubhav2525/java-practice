//wap to sum of n natural numbers
import java.util.Scanner;
public class Ques03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the nth term : ");
        int num=sc.nextInt(),sum=0;
        for(int i=1;i<=num;i++)
            sum=sum+i;
        System.out.println("The sum of total natural number from 1 - "+num+" : "+sum);
        sc.close();
    }
}
