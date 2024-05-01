package oops.polymorphism.overloading;

public class TesterArea {
    public static void main(String[] args) {
        ShapesArea shape = new ShapesArea();

        float circleArea = shape.calculateArea(1.7f);
        float rectangleArea = shape.calculateArea(2.5f, 3.4f);
        double triangleArea = shape.calculateArea(24.0, 12f);

        System.out.println("Area of circle: " + circleArea);
        System.out.println("Area of rectangle: " + rectangleArea);
        System.out.println("Area of triangle : " +triangleArea);


    }

}
