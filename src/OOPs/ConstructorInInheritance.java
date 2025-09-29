package OOPs;

class Base1{
    Base1(){
        System.out.println("I am a Constructor");
    }
    Base1(int x){
        System.out.println("I am an  overloaded Constructor with value of x as: "+ x);
    }
}
class Derived1 extends Base1{
    Derived1(){
//        super(0);
        System.out.println("I am a derived class constructor");
    }
    Derived1(int x, int y){
        super(x);
        System.out.println("I am an overloaded constructor of Derived with value of y as: " + y);
    }
}
class ChildOfDerived extends Derived1{
    ChildOfDerived(){
        System.out.println("I am a child of derived constructor");
    }
    ChildOfDerived(int x, int y, int z){
        super(x,y);
        System.out.println("I am an overloaded constructor of Derived with value of z as: " + z);
    }
}
public class ConstructorInInheritance {
    public static void main(String[] args) {
//        Base1 b = new Base1();
//        Derived1 d = new Derived1();
//        Derived1 d = new Derived1(4, 5);
//        ChildOfDerived cd = new ChildOfDerived();
        ChildOfDerived cd = new ChildOfDerived(3, 4, 5);
    }
}
