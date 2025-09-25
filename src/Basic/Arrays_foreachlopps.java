package Basic;

public class Arrays_foreachlopps {
    public static void main(String[] args) {
//        int [] marks = {98, 95, 65, 32, 64};
//        float [] marks = {98.1f, 95.2f, 65.6f, 32.5f, 64.8f};
//        String [] Students = {"Aadi", "Ankit", "Ashmit", "Akash"};
//        System.out.println(marks.length);
//        System.out.println(marks[1]);
//        System.out.println(Students.length);
//        System.out.println(Students[1]);

        int [] marks = {98, 95, 65, 32, 64};
//        System.out.println(marks.length);
//        Displaying the Array (Naive way)
        System.out.println("Printing using naive way");
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);

//        Displaying the Array (for loop)
        System.out.println("Printing using for loop");
        for (int i=1;i<marks.length;i++){
            System.out.println(marks[i]);
        }
//        Displaying the Array in reverse order (for loop)
        System.out.println("Printing using for loop in reverse order");
        for (int i=marks.length -1;i>=0;i--){
            System.out.println(marks[i]);
        }
//        Displaying the Array (for-each loop)
        System.out.println("Printing using for-each loop");
        for (int element : marks){
            System.out.println(element);
        }


    }
}
