public class operator {

    public static void main(String[] args) {
        test(127);
        test(128);
    }
    static void show(String desc, Integer n1, Integer n2){
        System.out.println(desc + ":");
        System.out.printf("%d==%d %b %b%n", n1, n2, n1 == n2, n1.equals(n2));
    }

    @SuppressWarnings("deprecation")
    public static void test(int value){
        Integer i1 = value;
        Integer i2 = value;
        show("Automatic",i1, i2);

        //这种初始化方法在Java9后被淘汰
        Integer r1 = new Integer(value);
        Integer r2 = new Integer(value);
        show("new Integer()",r1, r2);

        Integer v1 = Integer.valueOf(value);
        Integer v2 = Integer.valueOf(value);
        show("Integer.valueoOf()", v1, v2);

        //基本类型不能使用equals()方法
        int x = value;
        int y = value;
//        x.equals(y);
        System.out.println("Primitive int:");
        System.out.printf("%d==%d %b%n", x, y, x==y);


    }
}
