package OOPs;

import java.lang.reflect.Array;
import java.util.*;

public class Collections {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();
        l1.add(6);
        l1.add(7);
        l1.add(4);
        l1.add(6);
        l1.add(0,5);
        l1.add(0,1);
        for (int i=0; i<l1.size(); i++){
            System.out.println(l1.get(i));
        }
    }
}
