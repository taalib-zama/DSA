package designPattern.structural.BridgePattern.sample;

public class Circle extends Shape{

    public Circle(Color color) {
        super(color);
    }

    @Override
    public String draw() {
        return "Drawing Circle. " + color.fill();
    }
}
