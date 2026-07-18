// import java.util.Scanner;

// public class Assignments {

//     static Scanner sc = new Scanner(System.in);

//     // Assignment 1
//     static void assignment1() {
//         int n = sc.nextInt();

//         for (int i = 1; i <= n; i++) {
//             if (i % 2 == 0)
//                 System.out.println(i + " -> Even");
//             else
//                 System.out.println(i + " -> Odd");
//         }
//     }

//     // Assignment 2
//     static void assignment2() {
//         int n = sc.nextInt();

//         for (int i = 1; i <= n; i++) {
//             System.out.println("Table of " + i);

//             for (int j = 1; j <= 10; j++) {
//                 System.out.println(i + " x " + j + " = " + (i * j));
//             }

//             System.out.println();
//         }
//     }

//     // Assignment 3
//     static void assignment3() {
//         int start = sc.nextInt();
//         int end = sc.nextInt();

//         for (int i = start; i <= end; i++) {

//             if (i < 2)
//                 continue;

//             boolean prime = true;

//             for (int j = 2; j <= i / 2; j++) {
//                 if (i % j == 0) {
//                     prime = false;
//                     break;
//                 }
//             }

//             if (prime)
//                 System.out.println(i);
//         }
//     }

//     // Assignment 4
//     static void assignment4() {
//         int secret = 27;
//         boolean found = false;

//         for (int i = 1; i <= 5; i++) {

//             int guess = sc.nextInt();

//             if (guess == secret) {
//                 System.out.println("Congratulations! You guessed it.");
//                 found = true;
//                 break;
//             } else if (guess < secret) {
//                 System.out.println("Too Low");
//             } else {
//                 System.out.println("Too High");
//             }
//         }

//         if (!found)
//             System.out.println("Better Luck Next Time!");
//     }

//     // Assignment 5
//     static void assignment5() {
//         int start = sc.nextInt();
//         int end = sc.nextInt();

//         for (int i = start; i <= end; i++) {

//             int num = i;
//             int sum = 0;

//             while (num > 0) {

//                 int digit = num % 10;
//                 int fact = 1;

//                 for (int j = 1; j <= digit; j++) {
//                     fact *= j;
//                 }

//                 sum += fact;
//                 num /= 10;
//             }

//             // Handle 1 as a Strong Number
//             if (i == 1 || sum == i)
//                 System.out.println(i);
//         }
//     }

//     public static void main(String[] args) {

//         System.out.println("Choose Assignment:");
//         System.out.println("1. Even/Odd");
//         System.out.println("2. Multiplication Tables");
//         System.out.println("3. Prime Numbers");
//         System.out.println("4. Number Guessing Game");
//         System.out.println("5. Strong Numbers");

//         int choice = sc.nextInt();

//         switch (choice) {
//             case 1:
//                 assignment1();
//                 break;

//             case 2:
//                 assignment2();
//                 break;

//             case 3:
//                 assignment3();
//                 break;

//             case 4:
//                 assignment4();
//                 break;

//             case 5:
//                 assignment5();
//                 break;

//             default:
//                 System.out.println("Invalid Choice");
//         }

//         sc.close();
//     }
// }