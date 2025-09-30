package OOPs;

interface Bicycle{
    int a = 45;
    void applyBreak(int decrement);
    void speedUp(int increment);
}
interface HornBicycle{
    void BlowHorn();
    void blowhorn();
}
class AvonCycle implements Bicycle{
    void blowHorn(){
        System.out.println("pee pee poo poo");
    }
    public void applyBreak(int decrement){
        System.out.println("Applying Break");
    }
    public void speedUp(int increment){
        System.out.println("Applying SpeedUp");
    }
    public void BlowHorn(){
        System.out.println("kabhi khushi kabhi gam");
    }
    public void blowhorn(){
        System.out.println("mai hoon n");
    }
}

public class Interfaces_55 {
    public static void main(String[] args) {
        AvonCycle cycleAadi = new AvonCycle();
        cycleAadi.applyBreak(1);
        // You can create properties in interfaces
        System.out.println(cycleAadi.a);
//        you cannot modify the properties in interfaces as they are final
//        cycleAadi.a = 454;
//        System.out.println(cycleAadi.a);

        cycleAadi.BlowHorn();
        cycleAadi.blowhorn();
    }
}
