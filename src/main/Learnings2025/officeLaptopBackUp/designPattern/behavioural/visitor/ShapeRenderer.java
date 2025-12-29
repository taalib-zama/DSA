package designPattern.behavioural.visitor;

import java.awt.*;

public class ShapeRenderer implements ShapeVisitor {
    @Override
    public void visit(Circle circle) {
        System.out.println("Rendering Circle with radius: " + circle.getRadius());
    }

    @Override
    public void visit(Rectangle rectangle) {
        System.out.println("Rendering Rectangle with width: " + rectangle.getWidth() + " and height: " + rectangle.getHeight());
    }
}
