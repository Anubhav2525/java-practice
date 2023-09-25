// 1. Wap to accept n terms and add all the even numbers

// import java.util.Scanner;
// public class Ques10 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the last term : ");
//         int num = sc.nextInt();
//         int sum=0;
//         for (int i = 1; i <= num; i++) {
//             if (i % 2 == 0)
//               sum=sum+i;
//         }
//         System.out.println("Total sum of Even number from 1 to "+num+" : "+sum);
//         sc.close();
//     }
// }

// 2. Wap to accept n terms and add all the odd numbers

// import java.util.Scanner;
// public class Ques10 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the last term : ");
//         int num = sc.nextInt();
//         int sum=0;
//         for (int i = 1; i <= num; i++) {
//             if (i % 2 == 1)
//               sum=sum+i;
//         }
//         System.out.println("Total sum of Odd number from 1 to "+num+" : "+sum);
//         sc.close();
//     }
// }

// 3. Wap to accept n terms and add all the prime numbers

// import java.util.Scanner;
// public class Ques10 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the last term : ");
//         int num = sc.nextInt();
//         int sum = 0, prime;
//         for (int i = 2; i <= num; i++) {
//             prime = 0;
//             for (int j = 1; j <= i; j++) {
//                 if (i % j == 0) {
//                     prime++;
//                 }
//             }
//             if (prime == 2)
//                 sum = sum + i;
//         }
//         System.out.println("Total sum of prime number from 1 to " + num + " : " + sum);
//         sc.close();
//     }
// }


// 4. Wap to accept n terms and count all the even numbers

// import java.util.Scanner;
// public class Ques10 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the last term : ");
//         int num = sc.nextInt();
//         int sum=0;
//         for (int i = 1; i <= num; i++) {
//             if (i % 2 == 0)
//               sum++;
//         }
//         System.out.println("Total Even number from 1 to "+num+" : "+sum);
//         sc.close();
//     }
// }

// // 5. Wap to accept n terms and count all the prime numbers

// import java.util.Scanner;
// public class Ques10 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the last term : ");
//         int num = sc.nextInt();
//         int sum = 0, prime;
//         for (int i = 1; i <= num; i++) {
//             prime = 0;
//             for (int j = 1; j <= i; j++) {
//                 if (i % j == 0) {
//                     prime++;
//                 }
//             }
//             if (prime == 2)
//                 sum++;
//         }
//         System.out.println("Total count of prime number from 1 to " + num + " : " + sum);
//         sc.close();
//     }
// }



// 6. Wap to accept n terms and count all the odd numbers

// import java.util.Scanner;
// public class Ques10 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the last term : ");
//         int num = sc.nextInt();
//         int sum = 0;
//         for (int i = 1; i <= num; i++) {
//             if (i % 2 == 1)
//               sum++;
//         }
//         System.out.println("Total count of prime number from 1 to " + num + " : " + sum);
//         sc.close();
//     }
// }