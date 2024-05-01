package lambdaExpressions.functionalInterface.userDefinedFunctionalInterface;

public class FunctionalInterfaceExample implements sayable{


    public void say(String msg) {
        System.out.println(msg);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public static void main(String[] args) {
        FunctionalInterfaceExample fie = new FunctionalInterfaceExample();
        fie.say("Hello there");
        fie.show();
        System.out.println(fie.hashCode());
        System.out.println(fie.toString());
    }

}

