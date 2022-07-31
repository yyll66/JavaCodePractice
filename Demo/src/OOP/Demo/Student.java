package OOP.Demo;

public class Student {
    //属性
    private String name;
    private int age;

    public Student(){

    }
//    public Student(String name, int age){
//        this.name = name;
//        this.age = age ;
//    }
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return this.age;
    }
    public void setAge(int age){
        this.age = age;
    }

    //方法
    public void study(){
        System.out.println(this.name+"在学习");
    }

}
