package wrapperClass;

public class WrapperMethods {
    public static void main(String[] args) {
        char ch1 = 'a';
        Character z1 = ch1;
        System.out.println(z1); //concept of Boxing
        Integer ch2=10;
        int z2=ch2;
        System.out.println(z2); //concept of UnBoxing
        System.out.println("****************************************");
        // Type casting cannot be used to convert any wrapper type to another
        // Long phoneNoLong = (Long) new Integer(44281234);	// Will give compilation error
        // We can make use of methods like intValue(), byteValue(), floatValue(), etc.
        Integer phoneNo = 44281234;
        Long phoneNoLong = phoneNo.longValue();
        System.out.println("Integer to Long: " + phoneNoLong);
        System.out.println("****************************************");
        // Wrappers can be used to convert Integer to numeric String data type by using toString() method
        Integer my = 100;
        String myStr = my.toString();
        System.out.println(myStr.length());
        System.out.println("****************************************");
        // Wrappers can be used to convert numeric strings to numeric data types
        double numDouble = Double.parseDouble("123.45");
        System.out.println("String to double: " + numDouble);
        System.out.println("****************************************");
        // Wrappers can be used to convert an Integer to Binary String by using toBinaryString() method
        System.out.println("Integer 5 as binary string: " + Integer.toBinaryString(5));
    }
}
