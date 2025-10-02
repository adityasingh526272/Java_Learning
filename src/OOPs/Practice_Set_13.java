package OOPs;

class Practice13 extends Thread{
    public void run() {
        while (true){
            System.out.println("Good Morning");
        }
    }
}
class Practice13b extends Thread{
    public void run() {
        while (true){
            try {
                Thread.sleep(200);
            } catch (Exception e) {
                System.out.println(e);
            }
            System.out.println("Welcome");
        }
    }
}

public class Practice_Set_13 {
    public static void main(String[] args) {
        Practice13 p1 = new Practice13();
        Practice13b p2 = new Practice13b();
        p1.start();
        p2.start();
    }
}
