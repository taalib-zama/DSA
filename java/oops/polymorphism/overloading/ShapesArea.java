package oops.polymorphism.overloading;

public class ShapesArea {
    // Method to find the area of circle
    public float calculateArea(float radius) {
        return 3.14f * radius * radius;
    }

    // Method to find the area of rectangle
    public float calculateArea(float length, float breadth) {
        return length * breadth;
    }

    //  method to find the area of triangle
    public double calculateArea(double base, float height){
        return 0.5*base*height;
    }
}
