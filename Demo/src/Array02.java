public class Array02 {
    //稀疏数组
    public static void main(String[] args) {
        int [][] array1 = new int[11][11];
        array1[1][2]=1;
        array1[2][3]=2;

        System.out.println("输出原始数组");
        for (int [] ints: array1) {
            for(int anInt:ints){
                System.out.print(anInt+"\t");
            }
            System.out.println("");
        }
        
        //转换为稀疏数组
        //获取有效值的个数
        int sum = 0;
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[0].length; j++) {
                if(array1[i][j]!=0)
                    sum++;
            }
        }
        System.out.println("有效值的个数："+sum);

        //创建稀疏数组
        int [][] array2 = new int[sum+1][3];
        array2[0]= new int[]{array1.length, array1[0].length, sum};
        int flag = 1;
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[0].length; j++) {
                if(array1[i][j]!=0){
                    array2[flag]=new int[]{i,j,array1[i][j]};
                    flag++;
                }
            }
        }
        System.out.println("输出稀疏数组");
        for (int [] ints: array2) {
            for(int anInt:ints){
                System.out.print(anInt+"\t");
            }
            System.out.println("");
        }

        System.out.println("还原稀疏数组");
        System.out.println("==================");
        int row = array2[0][0];
        int col = array2[0][1];
        int count = array2[0][2];
        int[][] array3 = new int[row][col];
        for(int i=1;i<array2.length;i++){
            array3[array2[i][0]][array2[i][1]]=array2[i][2];
        }
        for (int [] ints: array3) {
            for(int anInt:ints){
                System.out.print(anInt+"\t");
            }
            System.out.println("");
        }
    }
}
