package designPattern.structural.BridgePattern.sample;
//// Concrete Implementor 1
public class RedColor implements Color {
    @Override
    public String fill() {
        return "Filling with Red color";
    }
}
