package Reflection;

public class Demo05 {
    public static void main(String[] args) {

        //获取系统类的加载器
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        System.out.println(systemClassLoader);

        //获取系统类加载器的父类加载器--->扩展类加载器
        ClassLoader parent = systemClassLoader.getParent();
        System.out.println(parent);

        //获取扩展类加载器的父类加载器--->根加载器(C/C++)
        ClassLoader parent1 = parent.getParent();
        System.out.println(parent1);

    }
}
