package OOPs;

class Employee{
    int id;
    String name;
    int salary;
    public void printDetails(){
        System.out.println("My name is "+ id);
        System.out.println("and my name is "+ name);
    }

    public int getsalary(){
        return salary;
    }
}
public class Custom_Class {
    public static void main(String[] args) {
        System.out.println("This is our custom class");
        Employee Aadi = new Employee();  // Instantiating a new Employee Object
        Employee Ankit = new Employee();
        // Setting attributes
        Aadi.id = 12;
        Aadi.salary = 45;
        Aadi.name = "CodeWithHarry";


        Ankit.id = 26;
        Ankit.salary = 50;
        Ankit.name = "CWH";


        // printing the attributes
        Aadi.printDetails();
        Ankit.printDetails();
        int salary = Ankit.getsalary();
        System.out.println(salary);
//        System.out.println(Aadi.id);
//        System.out.println(Aadi.name);
    }
}
