import java.util.Scanner;

public class Ques04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        for(int i=num;i>=1;i--)
        {
            for(int j=i;j<=num;j++)
                System.out.print(j);
            System.out.println();
        }
        sc.close();
    }
}
