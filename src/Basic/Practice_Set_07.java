package Basic;

public class Practice_Set_07 {
//    static int multiplication(int n){
//        for (int i=1; i<=10; i++){
//            System.out.format("%d X %d = %d\n",n, i, n*i );
//        }
//        return 1;
//    }

//    static void pattern(int n){
//        for (int i=0; i<n; i++){
//            for (int j=0; j<i+1; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }

//    static int sumRec(int n){
//        if (n==1){
//            return 1;
//        }
//        return n + sumRec(n-1);
//    }

//        static void pattern(int n){
//        for (int i=n; i>=1; i--){
//            for (int j=1; j<=i; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }

//    static int fib(int n) {
//        if (n <= 1) return n;
//        return fib(n - 1) + fib(n - 2);
//    }

//    static double average(double... nums) {
//        double sum = 0;
//        for (double n : nums) {
//            sum += n;
//        }
//        return nums.length > 0 ? sum / nums.length : 0;
//    }

//    static long factorial(int n) {
//        if (n <= 1) return 1;
//        return n * factorial(n - 1);
//    }

//    static int sumDigits(int n) {
//        if (n == 0) return 0;
//        return (n % 10) + sumDigits(n / 10);
//    }

//    static double toFahrenheit(double celsius) {
//        return (celsius * 9.0 / 5.0) + 32;
//    }

    static int fib(int n) {
        if (n <= 1) return n;

        int a = 0, b = 1, c = 0;
        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return b;
    }


        public static void main(String[] args) {
//        problem 1
//        multiplication(7);

//        problem 2
//        pattern(4);


//        problem 3
//       int c = sumRec(3);
//        System.out.println(c);

//        problem 4
//        pattern(4);

//        problem 5
//            int n = 10;
//            System.out.println("Fibonacci term at position " + n + " is: " + fib(n));

//            problem 6
//            System.out.println("Average: " + average(10, 20, 30, 40));

//            problem 7
//            int num = 5;
//            System.out.println("Factorial of " + num + " is: " + factorial(num));

//            problem 8
//            int num = 1234;
//            System.out.println("Sum of digits of " + num + " is: " + sumDigits(num));

//            problem 9
//            double c = 37;
//            System.out.println(c + "°C = " + toFahrenheit(c) + "°F");

//            problem 10
            int n = 10; // example: 10th term
            System.out.println("Fibonacci term at position " + n + " is: " + fib(n));
    }
}
