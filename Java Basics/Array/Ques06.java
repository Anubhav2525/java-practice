import java.util.Arrays;
import java.util.Scanner;

public class Ques06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        System.out.println("Enter the 10 numbers : ");
        for (int i = 0; i < 10; i++)
            arr[i] = sc.nextInt();
        Arrays.sort(arr);
        // Ascending order
        // System.out.println("Arrange in ascending order");
        // for (int i = 0; i < 10; i++) {
        // System.out.println(arr[i]);
        // }

        // Descending order
        // System.out.println("Arrange in descending order");
        // for (int i = 9; i >=0; i--) {
        // System.out.println(arr[i]);
        // }

        // Largest number
        System.out.println("Largest number: "+arr[arr.length-1]);

        // Smallest number
        System.out.println("Smallest number: "+arr[0]);
        
        sc.close();
    }
}
