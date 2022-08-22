package OOP;


import java.lang.annotation.*;

//测试元注解
@Myannotation
public class annotation {


    //没有默认值则必须给注解参数赋值
    @Myannotation(name= "abc")
    public void test(){

    }
}




@Target(value = {ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@interface Myannotation{

    //注解的参数：参数类型+参数名()
    String name() default "daoan";
    int age() default 0;
    int id() default -1;
    String[] schools() default {"国防科大","西北工业大学"};
}



