package oops.abstraction;

public class Rectangle extends Shape{
    double length;
    double width;

    public Rectangle(String color, double length,
                     double width)
    {
        // calling Shape constructor
        super(color);
        System.out.println("Rectangle constructor called");
        this.length = length;
        this.width = width;
    }

    @Override double area() { return length * width; }  //abstract method

    @Override public String toString()      //abstract method.
    {
        return "Rectangle color is " + super.getColor()
                + "and area is : " + area();
    }

}
