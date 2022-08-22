package ArrayTest;

import java.util.Arrays;

public class Demo01 {
    //定义一个长度为0的数组
    private int[] arr = new int[]{1,2,3,4,5};

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,0};
        Arrays.sort(arr);
        System.out.println(arr[0]);
        String sellerId = "123";
        String errmsg = String.format("The seller is null which gets from csesClinent.getSeller(sellerId: %s)", sellerId);
        System.out.println(errmsg);

    }


}
