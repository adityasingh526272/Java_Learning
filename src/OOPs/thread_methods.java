package OOPs;

class MyNewThr1 extends Thread {

    public void run() {
        int i = 0;
        while (true){
//            System.out.println("I am a thread");
            System.out.println("Thank u: ");
            try {
                Thread.sleep(455);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            i++;
        }

    }
}class MyNewThr2 extends Thread {

    public void run() {
        int i = 34;
        while (true){
//            System.out.println("I am a thread");
            System.out.println("Thank you: ");
        }

    }
}

public class thread_methods {
    public static void main(String[] args) {
        MyNewThr1 t1 = new MyNewThr1();
        MyNewThr2 t2 = new MyNewThr2();
        t1.start();

//        try{
//            t1.join();
//        } catch (Exception e){
//            System.out.println(e);
//        }

        t2.start();

    }
}
