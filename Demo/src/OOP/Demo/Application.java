package OOP.Demo;


public class Application {
    public static void main(String[] args) {
        A a = new A();
        a.test();    //结果为A=>test


        //方法的调用只和左边定义的数据类型有关,本来结果应该为B=>test
        //但是这里进行了重写，父类对象调用的是子类方法，这就是是多态
        B b = new A();
        b.test();   //结果为A=>test


        //


//        Student xm = new Student();
//        Student xh = new Student();
//
//        xm.setName("xm");
//        xm.setAge(3);
//
//        xh.setName("xh");
//        xh.setAge(4);
//
//        System.out.println(xm.getName());
//        System.out.println(xm.getAge());
//
//
//        Student daoan = new Student();
//
//        daoan.study();
//        if(daoan.getName() == null)  throw new NullPointerException("name is null");
//        System.out.println(daoan.getName().length());

//        System.out.println(xm==xh);
//        /*equal比较的是两个对象的内容是否相等，但是所有类都是继承自java.lang.Object类的，
//        所以适用于所有对象，如果没有对该方法进行覆盖的话，调用的仍然是Object类中的方法，
//        而Object中的equas方法返回是==的判断（但是许多类库已经进行了重写使得比较的是
//        对象中的成员变量值
//        */
//        //基本类型==比较的是值，对象类型比较的是对象地址
//        System.out.println(xm.equals(xh));

//        Teacher teacher = new Teacher("wu");
//        teacher.say();
//        teacher.test("wly");

    }
}
