package designPattern.creational.prototype;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Shape("Circle", "Red");
        Shape clonedCircle = circle.clone();

        System.out.println("Original: " + circle.getClass().hashCode());
        System.out.println("Cloned: " + clonedCircle.getClass().hashCode());//
        //the object hashcode is different but the class hashcode is same
    }
}
