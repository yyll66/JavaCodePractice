package OOP.Demo;

public class Teacher extends Person{

    public Teacher(){
        super();//隐藏代码可不写
        System.out.println("Teacher Constructor");
    }

    public Teacher(String name){
        this.name = name;
        System.out.println("Teacher Constructor with param");
    }

    private String name = "yyll";

    public void test(String name){
        System.out.println(name);
        System.out.println(this.name);
        System.out.println(super.name);
    }

}
