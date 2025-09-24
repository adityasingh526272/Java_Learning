package Basic;

public class Arrays {
    public static void main(String[] args) {
        /* Classroom of 500 students - you have to store marks of these 500 students
        you have 2 options :
        1. Create 500 variables
        2. Use arrays (recommended)
         */
//        There are three main ways to create an array in java
//        1. Declaration and memory allocation
//        int [] marks = new int[50];

//        2. Declaration and then memory allocation
//        int [] marks;
//        marks = new int[10];
//        marks[0] = 100;
//        marks[2] = 56;
//        marks[3] = 46;
//        marks[4] = 66;
//        marks[5] = 36;
//        System.out.println(marks[4]);

//        3. Declaration and memory allocation and initialization together
        int [] marks = {98, 45, 89, 78, 46};

//        marks[5] = 96; - throws ana error
        System.out.println(marks[4]);
    }
}
