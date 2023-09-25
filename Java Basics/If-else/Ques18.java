// WAP to check positive even or odd

import java.util.Scanner;

public class Ques18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num=sc.nextInt();
        if(num%2==0 && num>0)
            System.out.println("The number is positive even");
        else if(num%2==1 && num>0)
            System.out.println("Positive odd");
        sc.close();
    }
}
