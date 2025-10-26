package designPattern.structural.BridgePattern.sample;
//abstraction definition
public abstract class Shape {
    protected Color color;

    public Shape(Color color) {
        this.color = color;
    }

    public abstract String draw();
}
