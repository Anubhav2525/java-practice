
// WAp to calculate cube,square
import java.util.Scanner;

public class Ques4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        int square = 1, cube = 1;
        for (int i = 1; i <=2; i++)
            square = square * num;
        for (int i = 1; i <= 3; i++)
            cube = cube * num;
        System.out.println("Cube : " + cube);
        System.out.println("Square : " + square);
        sc.close();
    }
}
