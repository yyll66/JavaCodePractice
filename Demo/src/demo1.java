public class demo1 {
    public static void main(String[] args) {
        int [][] a=  {{1,2,3},{4,5,6}};
        for(int i=0; i<a.length;++i){
//            for(int j =0; j<a[i].length; ++j){
//                System.out.println(a[i][j]);
//            }
            printArray(a[i]);
        }
        System.out.println(a.length);
        System.out.println(a[0].length);
    }

    public static void printArray(int [] array){
        for (int i:array){
            System.out.println(i);
        }
    }
}
