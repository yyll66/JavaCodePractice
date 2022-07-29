package OOP.Demo;

public class Application {
    public static void main(String[] args) {
        Student xm = new Student("xm", 25);
        Student xh = new Student("xm",25);

        Student daoan = new Student();

        daoan.study();
        if(daoan.name == null)  throw new NullPointerException("name is null");
        System.out.println(daoan.name.length());

        System.out.println(xm==xh);
        /*equal比较的是两个对象的内容是否相等，但是所有类都是继承自java.lang.Object类的，
        所以适用于所有对象，如果没有对该方法进行覆盖的话，调用的仍然是Object类中的方法，
        而Object中的equas方法返回是==的判断（但是许多类库已经进行了重写使得比较的是
        对象中的成员变量值
        */
        //基本类型==比较的是值，对象类型比较的是对象地址
        System.out.println(xm.equals(xh));
    }
}
