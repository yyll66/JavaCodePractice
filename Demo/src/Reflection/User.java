package Reflection;

import java.security.PrivateKey;

public class User {
    private String name;
    private int id;
    private int age;

    public User(){

    }
    public User(String name, int id, int age){
        this.name = name;
        this.age = age;
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}
