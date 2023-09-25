import java.util.Scanner;

public class Ques03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        System.out.println("Enter the 10 numbers below");
        for(int i=0;i<10;i++)
            arr[i]=sc.nextInt();
        // 1. Find the count of even number

        // int count=0;
        // for(int i=0;i<10;i++){
        //     if(arr[i]%2==0)
        //         count++;
        // }
        // System.out.println("Total count of even numbers : "+count);

        // 2. Find the count of odd number

        // int count=0;
        // for(int i=0;i<10;i++){
        //     if(arr[i]%2==1)
        //         count++;
        // }
        // System.out.println("Total count of odd numbers : "+count);

        // 3. Find the count of positive even number

        // int count=0;
        // for(int i=0;i<10;i++){
        //     if(arr[i]%2==0 && arr[i]>0)
        //         count++;
        // }
        // System.out.println("Total count of positive even numbers : "+count);


        // 4. Find the total sum even number

        // int count=0;
        // for(int i=0;i<10;i++){
        //     if(arr[i]%2==0)
        //         count=count+arr[i];
        // }
        // System.out.println("Total sum even numbers : "+count);

        // 5. Find the total sum of odd number

        // int count=0;
        // for(int i=0;i<10;i++){
        //     if(arr[i]%2==1)
        //         count=count+arr[i];
        // }
        // System.out.println("Total sum of numbers : "+count);

        sc.close();
    }
}
