public class Ques04 {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 2; j++)
                System.out.print("*");
            for (int sp = 1; sp <= 2; sp++)
                System.out.print(" ");
            for (int k = 1; k <= 2; k++)
                System.out.print("*");
            System.out.println();
        }
        for (int i = 1; i <= 2; i++) {
            for (int j = 1; j <= 6; j++)
                System.out.print("*");
            System.out.println();
        }
        for (int i = 1; i <= 4; i++) {
            for (int sp = 1; sp <= 4; sp++)
                System.out.print(" ");
            for (int k = 1; k <= 2; k++)
                System.out.print("*");
            System.out.println();
        }
    }
}
