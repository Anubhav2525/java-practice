// Wap to print 1 to n
import java.util.Scanner;

public class Ques07 {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        for(int i=1;i<=num;i++)
            System.out.println(i);
        sc.close();
    }
}
