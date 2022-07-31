package Reflection;


public class Demo01 {
    public static void main(String[] args) throws ClassNotFoundException {
        //获取Class类的实例
        //1：通过类的全类名获取Class的对象
        Class c1 = Class.forName("Reflection.User");

        System.out.println(c1);
        //2：通过类的实例来获取Class对象
        User u = new User();
        System.out.println(u.getClass());
        //3：已知具体类，通过类的class属性获取，该方法最安全可靠，性能最高
        System.out.println(User.class);

        //内置基本数据类型可以直接用类名.Type

        System.out.println(Integer.TYPE);

        //获得父类的类型
        System.out.println(c1.getSuperclass());


        Class c2 = Class.forName("Reflection.User");
        Class c3 = Class.forName("Reflection.User");
        Class c4 = Class.forName("Reflection.User");


        //一个类在内存中只有一个class对象
        //一个类被加载后，类的整个结构都会被封装在Class对象中
        //如果hashcode相同，说明这三个对象是属于同一个类
        System.out.println(c2.hashCode());
        System.out.println(c3.hashCode());
        System.out.println(c4.hashCode());


    }
}
