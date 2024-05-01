package hackerearth.twelve;

import lombok.SneakyThrows;

import java.io.*;

public class serializable {
    @SneakyThrows
    public static void main(String[] args) {
        try{
            MyClass object1 = new MyClass("Hello",-7,2.1e10);
            FileOutputStream fos = new FileOutputStream("Serial");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(object1);
            oos.flush();
            oos.close();
        }
        catch (Exception e){
            System.out.println("Serializable" +e);
            System.exit(0) ;
        }

        try {
            MyClass object2;
            FileInputStream fis = new FileInputStream("Serial");
            ObjectInputStream ois = new ObjectInputStream(fis);
            object2 = (MyClass) ois.readObject();
            System.out.println(object2);
        }
        catch (Exception e){
            System.out.println("deserializable" +e);
            System.exit(0);
        }
    }
}
