package Basic;

public class Method_Overloading {
    static void foo(){
        System.out.println("Good morning bro!");
    }
    static void foo(int a){
        System.out.println("Good morning " + a + " bro!");
    }
    static void foo(int a, int b){
        System.out.println("Good morning " + a + " bro!");
        System.out.println("Good morning " + b + " bro!");
    }
    static void change(int a){
        a = 98;
    }
    static void change2(int [] arr){
        arr[0] = 98;
    }
    static void telljoke(){
        System.out.println("I invented a new word!\n " +
                "Plagiorism");
    }
    public static void main(String[] args) {
//        telljoke();

//        Case 1: Changing the integer
//        int x = 45;
//        change(x);
//        System.out.println("The value of x after running change is : " +x);

//        Case 2: Changing the array
//        int [] marks = {52, 78, 46, 56, 63};
//        change2(marks);
//        System.out.println("The value of x after running change is : " + marks[0]);

//        Method Overloading
        foo();
        foo(3000);
        foo(500, 400);
//        Arguments are actual
    }
}
