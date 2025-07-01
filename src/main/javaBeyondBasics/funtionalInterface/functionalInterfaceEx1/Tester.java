package funtionalInterface.functionalInterfaceEx1;

public class Tester implements Calculator{
    //implementing abstract method
    @Override
    public int doOperation(int num1, int num2) {
        return num1+num2;
    }

    public static void main(String[] args) {
        Calculator calculator = new Tester();

        //executing default method
        System.out.println(calculator.checkValues(5, 6));
        //executing implemented abstract method
        System.out.println(calculator.doOperation(5, 6));
    }
}
