package OOP.Clone;

public class shallowCloneExample implements Cloneable{

    private int[] arr;

    public shallowCloneExample(){
        arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
    }

    public void set(int index, int value){
        arr[index] = value;
    }

    public int get(int index){
        return arr[index];
    }

    @Override
    protected shallowCloneExample clone() throws CloneNotSupportedException{
        return (shallowCloneExample) super.clone();
    }


}
