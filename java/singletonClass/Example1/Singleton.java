package singletonClass.Example1;
// Implementing singleton class with using  getInstance() method
public class Singleton {
    // Static variable reference of single_instance of type Singleton
    private static Singleton single_instance = null;
    // Declaring a variable of type String
    public String s;
    // Constructor, Here we will be creating private constructor restricted to this class itself
    private Singleton()
    {
        s = "Hello I am a string part of Singleton class";
    }
    // Static method :  to create instance of Singleton class
    public static Singleton getInstance()
    {
        if (single_instance == null)
            single_instance = new Singleton();

        return single_instance;
    }

}
