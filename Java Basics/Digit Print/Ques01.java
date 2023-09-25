public class Ques01 {
    public static void main(String[] args) {
        for (int i = 1; i <= 6; i++) {
            for (int sp = 1; sp < 4; sp++)
                System.out.print(" ");
            for (int j = 3; j <= 4; j++)
                System.out.print("*");        
            System.out.println();
        }
        for(int i=1;i<=2;i++)
        {
            for(int j=1;j<=8;j++)
                System.out.print("*");
            System.out.println();
        }
    }
}