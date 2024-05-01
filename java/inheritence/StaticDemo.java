package inheritence;

public class StaticDemo {

    private static int i = 0; //static variable
    private int j; // instance variable
    public static void doDemo() {
        System.out.println("Do Demo");
    }

    public static void setNumber() {
        i++;
    }

    public static int getNumber() {
        return i;
    }

    public static void main(String[] args) {
        StaticDemo.doDemo();
        System.out.println(StaticDemo.getNumber());


        StaticDemo staticDemo = new StaticDemo();
        staticDemo.doDemo();
        staticDemo.setNumber();
        System.out.println(staticDemo.getNumber());

        StaticDemo staticDemo1 = new StaticDemo();
        staticDemo1.doDemo();
        staticDemo1.setNumber();
        System.out.println(staticDemo1.getNumber());

        System.out.println(staticDemo.getNumber());

    }
}
