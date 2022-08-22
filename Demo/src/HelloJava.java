import java.util.Date;


interface A{
    public final int a = 1;
    public abstract void funA();
}
interface B{
    public final int b = 2;
    void funB();
}

class Test implements A, B{

    @Override
    public void funA() {
        System.out.println("This is function A");
    }

    @Override
    public void funB() {
        System.out.println("This is function B");
    }

}

class C{
}
class D extends C{}

public class HelloJava {
    public static void main(String[] args) {
        String aa = String.valueOf(2);

        System.out.println(aa);

//        System.out.println("Hello Java");
//        System.out.println(new Date());
//        String s = "Hello";
//        s = "World"; //本质上是新实例化了一个String对象，然后将s的指向指到该对象
//        System.out.println(s); //改变的只是指向String类的实例的引用，而类不可变是指实例化后的对象不可变，即"Hello"
//        /*
//        而final修饰的字段初始化后的不可变是指引用的不可变，引用对象的内容可以变，但是指向不能变
//         */
    }


}