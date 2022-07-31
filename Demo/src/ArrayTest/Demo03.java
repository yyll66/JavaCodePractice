package ArrayTest;

import java.util.LinkedList;

public class Demo03 {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<String>();
        linkedList.add("Google");
        linkedList.add("Runnoob");
        linkedList.add("Taobao");
        linkedList.add("Weibo");
        linkedList.addFirst("Wiki");
        System.out.println(linkedList);
        linkedList.removeFirst();
        System.out.println(linkedList);
        linkedList.removeLast();
        System.out.println(linkedList);

        for (String s:linkedList) {
            System.out.print(s+" ");
        }
        System.out.println("");
        for (int i = 0; i < linkedList.size(); i++) {
            System.out.print(linkedList.get(i)+" ");

        }
    }
}
