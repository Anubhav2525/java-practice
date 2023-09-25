// Wap to accept a day number and display the week day
import java.util.Scanner;
public class Ques19{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the day not in week 1 - 7 : ");
        String day=sc.next();
        switch(day){
            case "1": 
                System.out.println("Monday");
                break;
            case "2":
                System.out.println("Tuesday");
                break;
            case "3":
                System.out.println("Wednesday");
                break;
            case "4":
                System.out.println("Thrusday");
                break;
            case "5":
                System.out.println("Friday");
                break;
            case "6":
                System.out.println("Saturday");
            case "7":
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Please enter between 1-7");
        }
        sc.close();
    }
}