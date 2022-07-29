package OOP;

import java.io.IOException;

public class Demo01 {
    public static void main(String[] args) {
        System.out.println(new Demo01().sayHello());
        Student.answer();
        new Student().say();
    }
    public String sayHello(){
        return "Hello";
    }

    public int max(int a, int b){
        return a>b?a:b;
    }

    public void readFile(String file) throws IOException{

    }

}
