package OOP.Polymorphism;

import org.w3c.dom.ls.LSOutput;
class B{
    String name = "B";
    int num =1;
}

class C extends B{
    String name = "C";
    int num =2;
    int son = 1;
}
public class Application {

    /*一个对象的实际类型是确定的
    * 但是指向的引用类型可以不确定
    * 如：s2是Person类型是确定的，但是指向的引用类型不一定是Person
    * */
    public static void main(String[] args) {
        B b = new C();
        System.out.println(b.name);
        System.out.println(b.num);
        System.out.println(b.getClass()  );


        Object object = new Student();

        System.out.println(object instanceof Student);
        System.out.println(object instanceof Person);
        System.out.println(object instanceof Teacher);
        System.out.println(object instanceof Object);
        System.out.println(object instanceof String);
        System.out.println("=======");
        Person person = new Student();
        System.out.println(person instanceof Student);
        System.out.println(person instanceof Person);
        System.out.println(person instanceof Teacher);
        System.out.println(person instanceof Object);
       // System.out.println(person instanceof String);


        System.out.println("================");
        Person person1 = new Person();
        System.out.println(person1 instanceof Student);




        System.out.println("========================");
        Person p1 = new Student();
        p1.say();;
        System.out.println(p1.name);

        //p1.study();
        ((Student) p1).study();    //高转低
        System.out.println(p1.name);
        System.out.println(((Student) p1).name);


        //Person p2 = new Person();
        //((Student) p2).study();  //编译通过，运行报错，因为此时p1是父类对象指向父类引用，不能往下转，而上面是父类对象指向子类引用



        System.out.println("============================");
        Student s1 = new Student();
        s1.say();
        //person1.study;
        System.out.println(s1.name);
        System.out.println(((Person) s1).name);
        //子类转换为父类可能会丢失自己本来的一些方法
        //System.out.println(((Person) s1).study());





    }


}
