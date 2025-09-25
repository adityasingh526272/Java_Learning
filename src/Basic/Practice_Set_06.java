package Basic;

import java.util.Scanner;

public class Practice_Set_06 {
    public static void main(String[] args) {

//        Question 1
//        float [] marks = {98.1f, 95.2f, 65.6f, 32.5f, 64.8f};
//        float sum = 0;
//        for (float num : marks){
//            sum += num;
//        }
//        System.out.println("Sum of floats : " + sum);

//        Question 2
//        int [] arr = {98, 95, 65, 32, 64};
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter number to search :");
//        int key = sc.nextInt();
//        boolean found = false;
//        for (int num : arr) {
//            if (num == key) {
//                found = true;
//                break;
//            }
//        }
//
//        if (found)
//            System.out.println(key + " is present in the array.");
//        else
//            System.out.println(key + " is NOT present in the array.");

//        Question 3
//        int[] marks = {75, 88, 92, 67, 81};
//        int sum = 0;
//        for (int m : marks) {
//            sum += m;
//        }
//        double average = (double) sum / marks.length;
//        System.out.println("Average marks in Physics = " + average);

//        Question 4
//        int[][] a = {
//                {1, 2, 3},
//                {4, 5, 6}
//        };
//        int[][] b = {
//                {6, 5, 4},
//                {3, 2, 1}
//        };
//        int[][] sum = new int[2][3];
//        for (int i = 0; i < 2; i++) {
//            for (int j = 0; j < 3; j++) {
//                sum[i][j] = a[i][j] + b[i][j];
//            }
//        }
//        System.out.println("Sum of the two matrices:");
//        for (int i = 0; i < 2; i++) {
//            for (int j = 0; j < 3; j++) {
//                System.out.print(sum[i][j] + " ");
//            }
//            System.out.println();
//        }

//        Question 5
//        int[] arr = {10, 20, 30, 40, 50};
//        System.out.println("Original array:");
//        for (int n : arr) System.out.print(n + " ");
//        int start = 0, end = arr.length - 1;
//        while (start < end) {
//            int temp = arr[start];
//            arr[start] = arr[end];
//            arr[end] = temp;
//            start++;
//            end--;
//        }
//        System.out.println("\nReversed array:");
//        for (int n : arr) System.out.print(n + " ");

//        Question 6
//        int[] arr = {15, 29, 3, 67, 41};
//        int max = arr[0];
//
//        for (int n : arr) {
//            if (n > max) {
//                max = n;
//            }
//        }
//
//        System.out.println("Maximum element = " + max);

//        Question 7
//        int[] arr = {15, 29, 3, 67, 41};
//        int min = arr[0];
//
//        for (int n : arr) {
//            if (n < min) {
//                min = n;
//            }
//        }
//        System.out.println("Minimum Element = " + min);

//        Question 8
        int[] arr = {3, 7, 10, 18, 25};
        boolean isSorted = true;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                isSorted = false;
                break;
            }
        }
        if (isSorted)
            System.out.println("Array is sorted in ascending order.");
        else
            System.out.println("Array is NOT sorted.");


    }
}
