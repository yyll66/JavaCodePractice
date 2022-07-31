package OOP.String;


class B{
    String getObjectAddress(){
        return super.toString();
    }
}


public class Demo01 {
    public static void main(String[] args) {
        B b = new B();
        System.out.println(b.getObjectAddress());
        func(b);
        System.out.println(b.getObjectAddress());
    }

    public static void func(B b){
        System.out.println(b.getObjectAddress());
        B tmp = new B();
        System.out.println(tmp.getObjectAddress());
        b = tmp;
    }
}

