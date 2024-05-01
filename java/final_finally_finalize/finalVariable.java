package final_finally_finalize;

public class finalVariable {
    //initializing a final variable.
    public final int number1  = 4;
    final int number2;
    final int numberconstructor;
    {
        number2 = 15;  //A blank final variable can be initialized inside an instance-initializer block or inside the constructor.
    }
    public finalVariable(){
        numberconstructor = 23;  // intializing final variable inside constructor
    }
    //decalring a final static variable and initializing later under static block
    static final int number3;
    static {
        number3 = 23;
    }
    public static void main(String args[])
    {
        // Declaring local final variable
        final int i;

        // Now initializing it with integer value
        i = 20;

        // Printing the value on console
        System.out.println(i);
    }

}
