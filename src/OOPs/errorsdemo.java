package OOPs;

import java.util.Scanner;

public class errorsdemo {
    public static void main(String[] args) {
        // Syntax error
//        int a = 5--> error: no semicolon
//        b=4;--> error: b not declared

        // Logical error demo
        // Write a program to print all prime numbers between 1 to 10
//        System.out.println(2);
//        for (int i=1; i>5; i++){
//            System.out.println(2*i+1);
//        }

        // runtime error
        int k;
        Scanner sc = new Scanner(System.in);
        k = sc.nextInt();
        System.out.println("Integer part of 1000 divided by k is " + 1000/k);
    }
}
