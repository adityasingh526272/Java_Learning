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
        MyThr t1 = new MyThr("Aadi1");
        MyThr t2 = new MyThr("Aadi2");
        MyThr t3 = new MyThr("Aadi3");
        MyThr t4 = new MyThr("Aadi4");
        MyThr t5 = new MyThr("Aadi5");
        t5.setPriority(Thread.MAX_PRIORITY);
        t1.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t5.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
