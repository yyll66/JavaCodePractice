package Reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Demo08 {
    public static void test01(){
        User user = new User();
        Long startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000000000; i++) {
            user.getName();
        }
        Long endTime = System.currentTimeMillis();
        System.out.println("以new的方式创建对象："+(endTime-startTime)+"ms");
    }

    public static void test02() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class c = User.class;
        Constructor constructor = c.getConstructor();

        User user1 = (User) constructor.newInstance();
        Method getName = c.getDeclaredMethod("getName",null);
        //getName.setAccessible(true);

        Long startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000000000; i++) {
            getName.invoke(user1,null);
        }
        Long endTime = System.currentTimeMillis();
        System.out.println("以Reflectiom的方式创建对象："+(endTime-startTime)+"ms");
    }
    public static void test03() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class c = User.class;
        Constructor constructor = c.getConstructor();

        User user1 = (User) constructor.newInstance();
        Method getName = c.getDeclaredMethod("getName",null);
        getName.setAccessible(true);

        Long startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000000000; i++) {
            getName.invoke(user1,null);
        }
        Long endTime = System.currentTimeMillis();
        System.out.println("以Reflectiom的方式创建对象并且关闭安全检测："+(endTime-startTime)+"ms");
    }
    public static void main(String[] args) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        test01();
        test02();
        test03();
    }
}
