package designPattern.behavioural.visitor;

public interface Shape {
    void accept(ShapeVisitor visitor);

}
