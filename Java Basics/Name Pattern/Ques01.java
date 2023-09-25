// Enter name : amit
// a
// am
// ami
// amit

import java.util.Scanner;

public class Ques01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name : ");
        String name = sc.next();
        int length = name.length();
        for (int i = 0; i < length; i++) {
            for (int j = 0; j <= i; j++)
                System.out.print(name.charAt(j));
            System.out.println();
        }
        sc.close();
    }
}