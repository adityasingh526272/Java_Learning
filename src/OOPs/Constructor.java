package OOPs;

class MyMainEmployee {
    private int id;
    private String name;

    public MyMainEmployee(){
        id = 45;
        name  = "Your-Name-Here";
    }
public MyMainEmployee(String myName, int myId){
    id = myId;
    name  = myName;
}
    public String getName() {
        return name;
    }

    public void setName(String n) {
        this.name = n;
    }

    public void setId(int i) {
        this.id = i;
    }

    public int getId() {
        return id;
    }
}
public class Constructor {
    public static void main(String[] args) {
//        MyMainEmployee aadi = new MyMainEmployee("ProgrammingWithHarry", 12);
        MyMainEmployee aadi = new MyMainEmployee();
//        aadi.setName("CodeWithHarry");
//        aadi.setId(45);
        System.out.println(aadi.getId());
        System.out.println(aadi.getName());

    }
}
