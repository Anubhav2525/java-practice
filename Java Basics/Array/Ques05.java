import java.util.Scanner;

public class Ques05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        System.out.println("Enter the 10 number");
        for (int i = 0; i < arr.length; i++)
            arr[i] = sc.nextInt();
        // int count=0;
        System.out.println("Enter the number to check : ");
        int num = sc.nextInt();
        for (int i = 0; i < 10; i++) {
            if (num == arr[i])
                System.out.println("The number is present at index : " + (i + 1));
        }
        sc.close();
    }
}
