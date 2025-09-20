package Basic;

import java.util.Scanner;

public class Marks_Percentage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] marks = new int[5];
        int total = 0;
        System.out.println("Enter marks of 5 subjects (out of 100):");
        for (int i = 0; i < 5; i++){
            System.out.println("Subject " + (i+1) + ": ");
            marks[i] = sc.nextInt();
            total += marks[i];
        }
        double percentage = (total / 500.0) * 100;
        System.out.println("Total marks: " + total + "/500");
        System.out.println("Percentage: " + percentage + "%");

    }
}
