package designPattern.creational.FactoryExample2.AbstractFactoryPattern;

public class DarkTextField implements TextField {
    @Override
    public void render() {
        System.out.println("Rendering dark text field");
    }
}
