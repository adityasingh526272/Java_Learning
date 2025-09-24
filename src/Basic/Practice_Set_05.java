package Basic;

import java.util.Scanner;

public class Practice_Set_05 {
    public static void main(String[] args) {
//        Question 1
//        int n = 4;
//        for (int i=n; i>0; i--){
//            for (int j=0; j<i;j++){
//                System.out.print("*");
//            }
//            System.out.print("\n");
//        }

//        Question 2
//        int sum=0;
//        int n=3;
//        for (int i=0; i<n;i++){
//            sum = sum + (2*i);
//        }
//        System.out.println("Sum of even numbers is: ");
//        System.out.println(sum);

//        Question 3
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Enter a number: ");
//        int n = sc.nextInt();
//
//        System.out.println("Multiplication Table of " + n + ":");
//        for (int i = 1; i <= 10; i++) {
//            System.out.println(n + " x " + i + " = " + (n * i));
//        }

//        Question 4
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a number: ");
//        int n = sc.nextInt();
//        System.out.println("Multiplication Table of " + n + ":");
//        for (int i=10; i>=1; i--){
//            System.out.println(n + " x " + i + " = " + (n * i));
//        }

//        Question 5
//        Scanner sc = new Scanner(System.in);

//        System.out.print("Enter a number: ");
//        int n = sc.nextInt();
//
//        long factorial = 1;
//
//        for (int i = 1; i <= n; i++) {
//            factorial = factorial * i;
//        }
//
//        System.out.println("Factorial of " + n + " is: " + factorial);

//        Question 6
//        int count = 1;
//
//        while (count <= 5) {
//            System.out.println(5);
//            count++;
//        }

//        Question 7
//       int count = 1;
//
//        while (count <= 5) {
//            System.out.println(1);
//            count++;
//        }

//        Question 8
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int sum = 0;

        System.out.println("Multiplication Table of " + n + ":");
        for (int i = 1; i <= 10; i++) {
            int product = n * i;
            System.out.println(n + " x " + i + " = " + product);
            sum += product;
        }

        System.out.println("Sum of all products = " + sum);
    }
}
