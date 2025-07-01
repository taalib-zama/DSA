package funtionalInterface.implementingFIs.UsingLambdaExpressions;

public class Test {
    public static void main(String[] args) {
        Bird EagleObject = (fly) -> {
            System.out.println("Eagle can fly " + fly);
        };
        EagleObject.canFly("high using FI");
    }
}
