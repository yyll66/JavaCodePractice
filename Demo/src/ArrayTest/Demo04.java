package ArrayTest;

import java.util.HashSet;

public class Demo04 {
    public static void main(String[] args) {
        HashSet<String> sites = new HashSet<String>();
        sites.add("Google");
        sites.add("Runoob");
        sites.add("Taobao");
        sites.add("Zhihu");
        sites.add("Runoob");
        System.out.println(sites);
        System.out.println(sites.contains("Taobao") & sites.contains("Runoob"));
        System.out.println(sites.contains("Wiki"));
        System.out.println(sites.size());
        for (String s:sites
             ) {
            System.out.println(s);
        }
    }
}
