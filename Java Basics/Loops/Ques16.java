/*wap to accept digits and add all of them 
    ex- 12345
    1+2+3+4+5=15
*/

import java.util.Scanner;

public class Ques16 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the numbers : ");
        int number=sc.nextInt();
        int sum = 0;
        for( int temp=number;temp>0;temp=temp/10)
            sum=sum+(temp%10);            
        System.out.println("The sum of "+number+" : "+sum);        
        sc.close();
    }
}
