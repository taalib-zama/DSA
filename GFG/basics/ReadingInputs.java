package basics;

import java.util.Scanner;

public class ReadingInputs {
    public static void main(String[] args) {
        //scanner class in java ref note
        //Scanner is a class in java.util package used for obtaining the input of the primitive types like int, double,
        // etc. and string
        //Scanner class helps to take the standard input stream in Java. So, we need some methods to extract data from
        // the stream. Below are some methods
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        System.out.println("you entered string : " +s);

        int a = in.nextInt();
        System.out.println("you entered integer : " +a);

        float b = in.nextFloat();
        //Sometimes, we have to check if the next value we read is of a certain type or if the input has ended
        // (EOF marker encountered).
        //if the scanner’s input is of the type we want with the help of hasNextXYZ() functions where XYZ is the type
        // we are interested in.
        if(in.hasNextFloat()){
            System.out.println("the current float value entered is " +b);
        }

        //JAVA CONSOLE CLASS
        // used to get input from console. It provides methods to read texts and passwords.
        //If you read password using Console class, it will not be displayed to the user.
//        // Using Console to input data from user
//        String name = System.console().readLine();
//        System.out.println(name);

        //// Java program to demonstrate working of System.console()
        //// Note that this program does not work on IDEs as
    }
}
