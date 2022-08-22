package OOP;

//抽象类
public abstract class Abstract {

    //抽象方法,写了大括号就会报错
    public abstract void doSomeThing();

    int age = 100;


}

class B extends Abstract {

    @Override
    public void doSomeThing() {
        System.out.println("==");
    }
}
