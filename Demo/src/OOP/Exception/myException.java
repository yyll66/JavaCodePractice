package OOP.Exception;

public class myException {
    public static void main(String[] args) {
        myException myexception = new myException();
        try {
            myexception.f();
        } catch (daoanException e) {
            System.out.println("Caught it");
        }
    }

    public void f() throws daoanException {
        System.out.println("" +
                "Throw myexception from f");
        throw new daoanException();
    }
}

class daoanException extends Exception{}
