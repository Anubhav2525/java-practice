// wap to accpet 5 number from user store them and print them

import java.util.Scanner;

public class Ques01{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr= new int[5];
        System.out.println("Enter 5 number");
        for(int i=0;i<5;i++)
            arr[i]=sc.nextInt();
        for(int i=0;i<5;i++)
            System.out.print(arr[i]+"\t");
        sc.close();
    }
}