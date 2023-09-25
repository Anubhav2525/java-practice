
// WAP to check quadratic equation
import java.util.Scanner;

public class Ques16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a : ");
        int a = sc.nextInt();
        System.out.println("Enter the value of b : ");
        int b = sc.nextInt();
        System.out.println("Enter the value of c : ");
        int c = sc.nextInt();
        int d = (b * b) - (4 * a * c);
        if (d > 0) {
            System.out.println("The roots are real and unequal : -");
            double x1 = ((-b - Math.sqrt(d)) / (2 * a));
            double x2 = ((-b + Math.sqrt(d)) / (2 * a));
            System.out.println("The x1 = "+x1+" and x2 = "+x2);
        }
        else if(d<0)
            System.out.println("The roots are imaginary");
        else if(d==0){
            System.out.println("The roots are real and equal : -");
            double x1=((-b - Math.sqrt(d)) / (2 * a));
            System.out.println("The roots are x1 = x2 : "+x1);
        }
        sc.close();
    }
}
