// Wap to print n to 1

import java.util.Scanner;

public class Ques06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        for(int temp=num;temp>=1;temp--)
            System.out.println(temp);
        sc.close();
    }
}
