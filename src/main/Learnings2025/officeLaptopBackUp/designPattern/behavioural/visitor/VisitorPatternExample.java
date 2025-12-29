package designPattern.behavioural.visitor;

import java.util.ArrayList;
import java.util.List;

public class VisitorPatternExample {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle(5));
        shapes.add(new Rectangle(4, 6));

        ShapeVisitor areaCalculator = new AreaCalculator();
        ShapeVisitor renderer = new ShapeRenderer();

        System.out.println("Calculating Areas:");
        for (Shape shape : shapes) {
            shape.accept(areaCalculator);
        }

        System.out.println("\nRendering Shapes:");
        for (Shape shape : shapes) {
            shape.accept(renderer);
        }
    }

}
