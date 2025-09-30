package OOPs;

abstract class Pen{
    abstract void write();
    abstract void refill();
}
class FountainPen extends Pen{
    void write(){
        System.out.println("Refill");
    }
    void refill(){
        System.out.println("Refill");
    }
    void changeNib(){
        System.out.println("Changing the pen");
    }
}
class Monkey{
    void jump(){
        System.out.println("Jumping..");
    }
    void bite(){
        System.out.println("Biting..");
    }
}
interface BasicAnimal{
    void eat();
    void sleep();
}
class Human extends Monkey implements BasicAnimal{
    void speak(){
        System.out.println("Hello sir!");
    }

    @Override
    public void eat() {
        System.out.println("Eating");
    }

    @Override
    public void sleep() {
        System.out.println("Sleeping");
    }
}

abstract class telePhone{
    abstract void ring();
    abstract void lift();
    abstract void disconnect();
}
class smartTelephone extends telePhone{
    @Override
    void ring() {
        System.out.println("smartTelephone is ringing..");
    }

    @Override
    void lift() {
        System.out.println("Call lifted on smartTelephone");
    }

    @Override
    void disconnect() {
        System.out.println("Call disconnected on smartTelephone");
    }

}

public class Practice_Set_11 {
    public static void main(String[] args) {
        // Q1 & Q2
        FountainPen pen = new FountainPen();
        pen.changeNib();

        // Q3
        Human Aadi = new Human();
        Aadi.sleep();

        // Q5
        Monkey m1 = new Human();
        m1.bite();
        m1.jump();
        // m1.speak(); --> Cannot use speak method because the reference is monkey which does not have speak method

        BasicAnimal lovish = new Human();
        lovish.eat();
        lovish.sleep();

        //Q4
        telePhone t = new smartTelephone();
        t.ring();
        t.lift();
        t.disconnect();

    }
}
