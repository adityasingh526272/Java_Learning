package OOPs;

class MyEmployee{
    private int id;
    private String name;

    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }
    public void setId(int i){
        id = i;
    }
    public int getId(){
        return id;
    }

}
public class Access_Modifier {
    public static void main(String[] args) {
        MyEmployee aadi = new MyEmployee();
//        aadi.id = 45;
//        aadi.name = "CWH";
        aadi.setName("CWH");
        System.out.println(aadi.getName());
        aadi.setId(456);
        System.out.println(aadi.getId());
    }
}
