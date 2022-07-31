package OOP;

public class Trans {
    public static void main(String[] args) {
        Person person = new Person();

        System.out.println(person.name);

        Trans.change(person);

        System.out.println(person.name);
    }

    //引用 传递
    public static void change(Person person){
        person.name = "daoan";
    }
}


class Person{
    String name;
}