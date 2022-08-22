package Reflection;

//测试类的加载过程
public class Demo03 {
    public static void main(String[] args) {
        A a = new A();
        System.out.println(A.m);
    }
    /*
    1.加载到内存，产生一个类对应的Class对象
    2.链接，为静态变量分配内存并初始化默认值，这些内存在方法区中进行分配，m=0;
    3.初始化
        类变量的赋值动作和静态代码块中的语句合并
        <clinit>(){
            m = 100;
            System.out.println("类A的静态代码块初始化");
            m = 300;
        }
     */

}

class A{
    static int m = 100;

    static {
        System.out.println("类A的静态代码块初始化");
        m = 300;
    }

    //static int m = 100;


    public A() {
        System.out.println("类A的无参构造");
    }
}
