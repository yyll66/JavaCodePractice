package OOP.Demo;

public class Person {

    public Person(){
        System.out.println("Person Constructor");
    }
    public Person(String name){
        this.name = name;
        System.out.println("Person Constructor with param");
    }
    protected String name = "daoan";
    public void say(){
        System.out.println("I am a person");
    }
}
