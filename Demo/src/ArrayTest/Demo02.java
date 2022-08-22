package ArrayTest;

import java.util.ArrayList;
import java.util.Collections;

public class Demo02 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(6);
        arrayList.add(9);
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(3);
        arr.add(5);
        arr.add(6);
        arr.add(5);
        arrayList.addAll(1,arr);
        System.out.println(arr);
        System.out.println(arrayList);

        for (Integer i : arrayList) {
            System.out.print(i+" ");
        }
        System.out.println("");
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.print(arrayList.get(i)+" ");
        }


    }
}
