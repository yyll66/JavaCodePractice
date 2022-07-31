package Serialize;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeDemo {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.name = "Reyan Ali";
        e.address = "Peking";
        e.SSN = 111222333;
        e.number = 110;

        //序列化对象e
        try {
            FileOutputStream fileOUt = new FileOutputStream("/tmp/employee.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOUt);
            out.writeObject(e);
            out.close();
            fileOUt.close();
            System.out.println("Serialized data is saved in /tmp/employee.ser");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
