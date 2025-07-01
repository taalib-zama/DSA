package funtionalInterface.implementingFIs.UsingImplementsConcreteClass;

public class Eagle implements Bird {
    @Override
    public void canFly(String fly) {
        System.out.println("Eagle can fly " + fly);
    }

    public static void main(String[] args) {
        Eagle eagle = new Eagle();
        eagle.canFly("high");
    }
}
