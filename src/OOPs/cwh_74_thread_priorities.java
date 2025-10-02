package OOPs;

class MyThr1 extends Thread {
    public MyThr1(String name) {
        super(name);
    }

    public void run() {
        int i = 34;
        while (true){
//            System.out.println("I am a thread");
            System.out.println("Thank u: " + this.getName());
        }

    }
}
public class cwh_74_thread_priorities {
    public static void main(String[] args) {
        // Ready queue: T1 T2 T3 T4 T5
        MyNewThr2 t1 = new MyNewThr2("Aadi1");
        MyNewThr2 t2 = new MyNewThr2("Aadi2");
        MyNewThr2 t3 = new MyNewThr2("Aadi3");
        MyNewThr2 t4 = new MyNewThr2("Aadi4");
        MyNewThr2 t5 = new MyNewThr2("Aadi5 (most important)");
        t5.setPriority(Thread.MAX_PRIORITY);
        t1.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
