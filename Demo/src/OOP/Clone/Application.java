package OOP.Clone;

public class Application {
    public static void main(String[] args) {
        shallowCloneExample e1 = new shallowCloneExample();
        shallowCloneExample e2 = null;
        try{
            e2 = e1.clone();  //浅拷贝
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        e1.set(2, 222);
        System.out.println("e2浅拷贝e1，拷贝对象与原始对象的引用同一个对象：" + e2.get(2));
        System.out.println("==================================================");

        DeepCloneExample d1 = new DeepCloneExample();
        DeepCloneExample d2 = null;
        try{
            d2 = d1.clone();  //浅拷贝
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        d1.set(2, 222);
        System.out.println("d2深拷贝e1，拷贝对象与原始对象的引用不同对象：" + d2.get(2));



    }
}
