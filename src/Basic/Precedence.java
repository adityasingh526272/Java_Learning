package Basic;

public class Precedence {
    public static void main(String[] args) {
//        int a = 6*5-34/2;
//        int b = 30/5-34*2;
//        System.out.println(a);
//        System.out.println(b);

//        Quick Quiz
//        int x = 5;
//        int y = 6;
//        int k = x * y/2;

        int a = 4;
        int b = 2;
        int c = 6;

        int k = (b*b - 4*a*c)/(2*c);
        int t = b*b - 4*a*c/2*c;
        System.out.println(t);
        System.out.println(k);

    }
}
