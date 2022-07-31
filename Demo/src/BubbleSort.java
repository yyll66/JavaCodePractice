import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int []a={6,1,3,5,2,7,4};
        System.out.println(Arrays.toString(bubbleSort(a)));
    }

    public static int[] bubbleSort(int[] array){
        for(int i=0; i<array.length; ++i){
            for (int j = i+1;j<array.length;++j){
                if(array[i]>array[j]){
                    int tmp;
                    tmp = array[j];
                    array[j] = array[i];
                    array[i] = tmp;
                }
            }
        }
        return array;
    }
}
