// Amit
// Ami
// Am
// A

import java.util.Scanner;

public class Ques02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name : ");
        String name = sc.next();
        int length = name.length();
        for (int i = length; i>=0; i--) {
            for (int j = 0; j < i; j++)
                System.out.print(name.charAt(j));
            System.out.println();
        }
        sc.close();
    }
}
