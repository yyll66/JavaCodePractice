package OOP.Exception;


class MyException extends Exception{
    MyException(){}
    MyException(String msg){super(msg);}
}


public class demo02 {
    public static void f() throws MyException {
        System.out.println("Throw MyException from f()");
        throw new MyException();
    }
    public static void g() throws MyException {
        System.out.println("Throw MyException from g(0");
        throw new MyException("Originated in g()");
    }

    public static void main(String[] args) {
        try{
            f();
        }catch (MyException e){
            e.printStackTrace(System.out);
        }

        try {
            g();
        }catch (MyException e){
            e.printStackTrace(System.out);
        }

    }
}

