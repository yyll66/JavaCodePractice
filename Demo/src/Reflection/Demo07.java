package Reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Demo07 {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException, NoSuchFieldException {
        Class c1 = Class.forName("Reflection.User");

        //无参构造对象
        //User user = (User) c1.newInstance();

        //调用构造器生成对象
        Constructor constructor = c1.getDeclaredConstructor(String.class, int.class, int.class);
        User u = (User) constructor.newInstance("daoan", 1, 25);
        System.out.println(u.getName()+" "+u.getAge()+ " "+u.getId());

        //通过操作方法
        Method setName = c1.getDeclaredMethod("setName", String.class);
        setName.invoke(u,"yyll");
        System.out.println(u.getName());

        //通过反射操作属性
        Field name = c1.getDeclaredField("name");
        //name.set(u,"wly");  //由于name是private修饰，这种方法无法访问

        name.setAccessible(true);  //关闭安全检测程序
        name.set(u,"wly");
        System.out.println(u.getName());

    }
}
