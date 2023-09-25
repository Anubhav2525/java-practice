import java.util.Scanner;

public class Ques04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int[] tempArray = new int[10];
        System.out.println("Enter the 10 numbers below");
        for (int i = 0; i < 10; i++)
            arr[i] = sc.nextInt();
        for (int i = 0; i < 10; i++)
            tempArray[i] = arr[i];
        System.out.println("Original Array    Temporary Array");
        for(int i=0;i<10;i++)
            System.out.println("\t"+arr[i]+"\t\t"+tempArray[i]);
        System.out.println();
        sc.close();
    }
}
