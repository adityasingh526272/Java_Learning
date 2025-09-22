package Basic;

import java.util.Scanner;

public class else_if_Statements {
    public static void main(String[] args) {
        int age;
        System.out.println("Enter your age : ");
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();
//        if (age>60){
//            System.out.println("Experienced!");
//        }
//        else if (age>40) {
//            System.out.println("Semi Experienced!");
//
//        } else if (age>30) {
//            System.out.println("Semi Semi Experienced!");
//
//        }
//        else {
//            System.out.println("Not Experienced!");
//        }

        switch (age) {
            case 18:
                System.out.println("Become an adult!");
                break;
            case 23:
                System.out.println("Join a job!");
                break;
            case 60:
                System.out.println("Get retired!");
                break;
            default:
                System.out.println("Enjoy");
                break;
        }
    }
}
