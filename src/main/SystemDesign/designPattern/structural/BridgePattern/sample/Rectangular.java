package designPattern.structural.BridgePattern.sample;

public class Rectangular extends Shape{

    public Rectangular(Color color) {
        super(color);
    }

    @Override
    public String draw() {
        return "Drawing Rectangular. " + color.fill();
    }
}
