//WAP to check largest among 3 numbers
import java.util.Scanner;
public class Ques14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the three numbers : ");
        int num1=sc.nextInt(),num2=sc.nextInt(),num3=sc.nextInt();
        if(num1>num2 && num1>num3)
            System.out.println(num1 +" is greater than "+num2+" and "+num3);
        else if(num2>num1 && num2>num3)
            System.out.println(num2+" is greater than "+num1+" and "+num3);
        else if(num3>num1 && num3>num1)
            System.out.println(num3+" is greater than "+num1+" and "+num2);
        sc.close();
    }
}
