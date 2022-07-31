package OOP.Demo;

public class Student {
    //属性
    String name;
    int age;

    public Student(){

    }
    public Student(String name, int age){
        this.name = name;
        this.age = age ;
    }

    //方法
    public void study(){
        System.out.println(this.name+"在学习");
    }

}
