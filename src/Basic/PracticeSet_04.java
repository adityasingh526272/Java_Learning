package Basic;

//import java.util.Scanner;
//
//public class PraticeSet_04 {
//    public static void main(String[] args) {

//    Question 1
//        int a = 10;
//        if (a == 11){
//            System.out.println("I am 11");
//        }
//        else{
//            System.out.println("I am not 11");
//        }

//        Question 2
//        byte m1, m2, m3;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Physics marks:");
//        m1 = sc.nextByte();
//        System.out.println("Chemistry marks:");
//        m2 = sc.nextByte();
//        System.out.println("Maths marks:");
//        m3 = sc.nextByte();
//        float avg = (m1+m2+m3)/3.0f;
//        System.out.println("Your overall percentage is : " + avg);
//        if (avg>=40 && m1>=33 && m2>=33 && m3>=33) {
//            System.out.println("Congratulations, you are promoted");
//        }
//        else {
//            System.out.println("Fail");
//        }

//        Question 3
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your income in lakhs: ");
//        float tax = 0;
//        float income = sc.nextFloat();
//        if(income<2.5){
//            tax = tax +0;
//        }
//        if(income>2.5f && income<=5.0f){
//            tax =  tax + 0.05f * (income - 2.5f);
//        }
//        else if(income>5.0f && income<=10.0f){
//            tax = tax + 0.05f * (5.0f - 2.5f);
//            tax = tax + 0.2f * (income - 5.0f);
//        }
//        else if(income>10.0f){
//            tax = tax + 0.05f * (5.0f - 2.5f);
//            tax = tax + 0.2f * (10.0f - 5.0f);
//            tax = tax + 0.3f * (income - 10.0f);
//        }
//        System.out.println("The total tax paid by employee is: " +tax);


//        Question 4
//        int days;
//        System.out.println("Enter days : ");
//        Scanner sc = new Scanner(System.in);
//        days = sc.nextInt();
//        switch (days) {
//            case 1 -> System.out.println("Monday");
//            case 2 -> System.out.println("Tuesday");
//            case 3 -> System.out.println("Wednesday");
//            case 4 -> System.out.println("Thursday");
//            case 5 -> System.out.println("Friday");
//            case 6 -> System.out.println("Saturday");
//            case 7 -> System.out.println("Sunday");
//            default -> System.out.println("Out of days!");
//        }

//        Question 5
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter a year: ");
//        int year = sc.nextInt();
//        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
//            System.out.println(year + " is a Leap Year.");
//        } else {
//            System.out.println(year + " is NOT a Leap Year.");


//        Question 6✅ Required import

import java.util.Scanner;

    public class PracticeSet_04 {       // ✅ Class name
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String website = sc.next();

            if (website.endsWith(".org")) {
                System.out.println("This is an organizational website");
            }
            else if (website.endsWith(".com")) {
                System.out.println("This is a commercial website");
            }
            else if (website.endsWith(".in")) {
                System.out.println("This is an Indian website");
            }
            else {
                System.out.println("Unknown website type");
            }
        }



}
