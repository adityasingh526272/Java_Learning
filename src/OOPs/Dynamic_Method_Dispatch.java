package OOPs;

import java.util.Objects;
import java.util.Optional;

class Phone{
    public void showTime(){
        System.out.println("time is 2 a.m.");
    }
    public void on(){
        System.out.println("My name is Java");
    }
}
class SmartPhone extends Phone{
    public void music(){
        System.out.println("Playing music");
    }
    public void on(){
        System.out.println("Turning on Smartphone..");
    }
}
public class Dynamic_Method_Dispatch {
    public static void main(String[] args) {
//        Phone obj = new Phone();
//        SmartPhone smobj = new SmartPhone();
//        obj.name();

        Phone obj = new SmartPhone();

        obj.showTime();
        obj.on();

    }
}
