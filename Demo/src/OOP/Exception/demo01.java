package OOP.Exception;

public class demo01 {
    public static void main(String[] args) {
        System.out.println(new demo01().divided(1));
        System.out.println(new demo01().divided(0));
    }

    public int divided(int a){
        try {
            if (a == 0) {
                throw new ArithmeticException("分母不可为0");
            }
        }catch (ArithmeticException e){
            System.out.println("重新输入，分母不可为0");
        }
        return 10/a;
    }}
