public class Ques00 {
    public static void main(String[] args) {
        for (int i = 1; i <= 2; i++) {
            for (int j = 1; j <= 10; j++)
                System.out.print("*");
            System.out.println();
        }
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= 2; j++)
                System.out.print("*");
            for (int sp = 1; sp <= 6; sp++)
                System.out.print(" ");
            for (int k = 1; k <= 2; k++)
                System.out.print("*");
            System.out.println();
        }
        for (int i = 1; i <= 2; i++) {
            for (int j = 1; j <= 10; j++)
                System.out.print("*");
            System.out.println();
        }
    }
}



/* 

Output -

**********
**********
**      **
**      **
**      **
**      **
**      **
**      **
**********
**********

*/
