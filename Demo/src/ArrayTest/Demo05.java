package ArrayTest;

import java.util.HashMap;

public class Demo05 {
    public static void main(String[] args) {
        HashMap<Integer, String> sites = new HashMap<>();
        sites.put(1, "Google");
        sites.put(2,"Runoob");
        sites.put(3,"Taobao");
        System.out.println(sites);
        System.out.println(sites.get(3));
        System.out.println(sites.size());
        System.out.println(sites.get(6));
        for (Integer integer : sites.keySet()) {
            System.out.println("Key: "+integer+" value: "+sites.get(integer));
        }
        for (String value : sites.values()) {
            System.out.print(value+" ");
        }
    }
}
