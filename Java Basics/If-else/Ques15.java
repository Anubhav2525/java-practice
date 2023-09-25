
// Wap to check profit and loss
import java.util.Scanner;

public class Ques15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the selling price : ");
        int sp = sc.nextInt();
        System.out.println("Enter the cost price : ");
        int cp = sc.nextInt();
        if (sp > cp)
            System.out.println("You got profit");
        else if (sp < cp)
            System.out.println("You got loss ");
        sc.close();
    }
}
