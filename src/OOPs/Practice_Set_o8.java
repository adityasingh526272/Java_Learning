package OOPs;

//class Employee1{
//    int salary;
//    String name;
//
//    public int getSalary() {
//        return salary;
//    }
//    public String getName(){
//        return name;
//    }
//    public void setName(String n){
//        name = n;
//    }
//}


//class CellPhone{
//    public void ring(){
//        System.out.println("Ringing...");
//    }
//    public void vibrate(){
//        System.out.println("Vibrating..");
//    }
//    public void callFriend(){
//        System.out.println("Calling Mukul ...");
//    }
//}

//class Square{
//    int side;
//    public int area(){
//        return side*side;
//    }
//    public int perimeter(){
//        return 4*side;
//    }
//}

class Tommyvecetti{
    void hitting(){
        System.out.println("Tommy is hitting...");
    }
    void running(){
        System.out.println("Tommy is running...");
    }
    void firing(){
        System.out.println("Tommy is firing...");
    }
}
public class Practice_Set_o8 {
    public static void main(String[] args) {
        //Problem 1
//        Employee1 Aadi = new Employee1();
//        Aadi.setName("CodeWithHarry");
//        Aadi.salary = 555;
//        System.out.println(Aadi.getName());
//        System.out.println(Aadi.salary);

        //Problem 2
//        CellPhone asus = new CellPhone();
//        asus.callFriend();
//        asus.ring();
//        asus.vibrate();

        //Problem 3
//        Square sq = new Square();
//        sq.side = 3;
//        System.out.println(sq.area());
//        System.out.println(sq.perimeter());

        //Problem 5
        Tommyvecetti tommy = new Tommyvecetti();
        tommy.hitting();
        tommy.running();
        tommy.firing();
    }
}
