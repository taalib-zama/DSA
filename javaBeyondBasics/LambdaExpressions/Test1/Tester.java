package LambdaExpressions.Test1;

public class Tester {
    private int operate(int x, int y, Interface1 functionalObject) {
        return functionalObject.command(x, y);
    }
    public static void main(String args[]) {
        Interface1 addition = (int a, int b) -> a + b;
        Interface1 multiplication = (int a, int b) -> a * b;
        Tester tobj = new Tester();
        System.out.println("Addition of 6 and 3 is: " + tobj.operate(6, 3, addition));
        System.out.println("Multiplication of 6 and 3 is: " + tobj.operate(6, 3, multiplication));
        Interface2 fobj = myString -> System.out.println("Hello " + myString);
        fobj.sayMessage("Infosys");
    }
}
