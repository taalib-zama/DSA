package designPattern.behavioural.visitor;


import java.awt.*;

public interface ShapeVisitor {
    void visit(Circle circle);
    void visit(Rectangle rectangle);
}
