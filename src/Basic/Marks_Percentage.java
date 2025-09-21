package Basic;

import java.util.Scanner;

public class Marks_Percentage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your physics marks : ");
        int physics = sc.nextInt();
        System.out.println("Enter your chemistry marks : ");
        int chemistry = sc.nextInt();
        System.out.println("Enter your maths marks : ");
        int maths = sc.nextInt();
        System.out.println("Enter your english marks : ");
        int english = sc.nextInt();
        System.out.println("Enter your computer marks : ");
        int computer = sc.nextInt();

        float percentage = ((physics + chemistry + maths + english + computer)/500.0f)*100;

        System.out.println(percentage);

    }
}
