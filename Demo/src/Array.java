import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int[] a= {2,3,1,4,6,7,2,42,6534,63,4,25,67};

        System.out.println(a);
        System.out.println(Arrays.toString(a));
        tostring(a);



    }

    public static void tostring(int [] a){

        for(int i=0; i<a.length; i++) {
            if (i == 0) {
                System.out.print("[" + a[i]+", ");
            } else if (i == a.length - 1)
                System.out.println(a[i] + "]");
            else
                System.out.print(a[i] + ", ");
        }
    }
}
