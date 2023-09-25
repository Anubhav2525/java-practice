
//Wap to check a year is leap or not
import java.util.Scanner;
public class Ques11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Year : ");
        int year=sc.nextInt();
        if(year%4==0)
            System.out.println("Leap Year "+year);
        else
            System.out.println("Normal Year");
        sc.close();
    }
}
