package Reflection;

import java.lang.annotation.*;
import java.lang.reflect.Field;

//反射操作注解
public class Demo09 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException {
        Class c1 = Class.forName("Reflection.student2");

        //通过反射获得注解
        Annotation[] annotations = c1.getAnnotations();
        for (Annotation annotation : annotations) {
            System.out.println(annotation);
        }

        //获得注解的value的值
        TableStudent tableStudent = (TableStudent) c1.getAnnotation(TableStudent.class);
        String value = tableStudent.value();
        System.out.println(value);

        //获得类指定的注解
        Field name = c1.getDeclaredField("name");
        FiledWu annotation = name.getAnnotation(FiledWu.class);
        System.out.println(annotation.columnName());
        System.out.println(annotation.Type());
        System.out.println(annotation.length());



    }

}

@TableStudent("db_student")
class student2{

    @FiledWu(columnName = "db_id", Type = "int", length = 10)
    private int id;
    @FiledWu(columnName = "db_age", Type = "int", length = 10)
    private int age;
    @FiledWu(columnName = "db_name", Type = "varchar", length = 3)
    private String name;

    public student2(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
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


//类名的注解
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface TableStudent{
    String value();
}


//属性的注解
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@interface FiledWu{
    String columnName();
    String Type();
    int length();
}