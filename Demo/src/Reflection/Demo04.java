package Reflection;
//测试类什么时候初始化
public class Demo04 {
    static {
        System.out.println("main静态被加载");
    }
    public static void main(String[] args) throws ClassNotFoundException {

        //主动引用
//        Son son = new Son();
//        System.out.println("===================");

        //反射引起主动引用
//        Class.forName("Reflection.Son");
//        System.out.println("===================");

//        System.out.println(Son.m);
//        System.out.println("===================");

        //子类访问父类的静态变量，不会引起子类初始化,只有真正声明这个域的类才会被初始化
//        System.out.println(Son.b);
//        System.out.println("===================");

        //数组定义类引用，不触发类的初始化
        Son[] arr = new Son[6];

        System.out.println("===================");

        //y引用常量不会引起初始化
        System.out.println(Son.M);
    }
}




class Son extends Father{
    static {
        System.out.println("子类被加载");
        m = 300;
    }
    static int m = 100;

    static final int M = 1;

}

class Father{

    static int b = 2;

    static {
        System.out.println("父类被加载");
    }
}
