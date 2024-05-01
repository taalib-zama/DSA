package oops.abstraction;

public class Circle extends Shape {
    double radius;

    public Circle(String color, double radius)  // constructor
    {

        // calling Shape constructor
        super(color);
        System.out.println("Circle constructor called");
        this.radius = radius;
    }

    @Override double area()                 //ovevrride abstract methods.//these must have an implementation.
    {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override public String toString()     //override abstract methods//these must have an implementation.
    {
        return "Circle color is " + super.getColor()
                + "and area is : " + area();
    }
}
