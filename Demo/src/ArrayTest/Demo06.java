package ArrayTest;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo06 {
    public static void main(String[] args) {
        ArrayList<String> sites = new ArrayList<String>();
        sites.add("Google");
        sites.add("Taobao");
        sites.add("Runoob");

        Iterator<String> it = sites.iterator();
        System.out.println(it.next());
        it.next();
        while(it.hasNext()){
            System.out.println(it.next());

        }

        Iterator<String> ite = sites.iterator();
        while(ite.hasNext()){
            if (ite.next() == "Taobao"){
                ite.remove();
            }
        }
        System.out.println(sites);
        System.out.println(it.hashCode());
        System.out.println(ite.hashCode());
    }
}
