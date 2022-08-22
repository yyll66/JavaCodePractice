package Reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

//获取类的信息
public class Demo06 {
    public static void main(String[] args) throws NoSuchFieldException, NoSuchMethodException {
        //Class c1 = Class.forName("Reflection.User");
        User user = new User();
        Class u1 = user.getClass();


        //获得类的名字
        System.out.println(u1.getName());  //获得包名 + 类名
        System.out.println(u1.getSimpleName()); //获得类名

        System.out.println("============================");
        //获得类的属性
        Field[] fields = u1.getFields(); //只能找到public属性


        fields = u1.getDeclaredFields(); //找到所有声明的属性
        for (Field field: fields) {
            System.out.println(field);
        }

        System.out.println(u1.getDeclaredField("age"));

        //获得类的方法
        System.out.println("============================");
        Method[] methods = u1.getMethods();//获得本类和父类的所有public方法
        for (Method method : methods) {
            System.out.println("正常的："+method);
        }

        methods = u1.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println("getDeclaredMethods："+method);//获得本类的所有的方法
        }

        //获得指定方法
        System.out.println("获得指定方法");
        Method getName = u1.getMethod("getName",null);
        Method setName = u1.getMethod("setName", String.class);
        System.out.println(getName);
        System.out.println(setName);

        //获得指定的构造器
        System.out.println("获得指定的构造器");
        Constructor[] constructors = u1.getConstructors();
        for (Constructor constructor : constructors) {
            System.out.println(constructor);
        }
        constructors = u1.getDeclaredConstructors();
        for (Constructor constructor : constructors) {
            System.out.println("#:" + constructor);
        }
    }
}
