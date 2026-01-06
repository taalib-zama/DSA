package designPattern.creational.FactoryExample2.AbstractFactoryPattern;

public class LightThemeFactory implements WidgetFactory {
    public Button createButton() { return new LightButton(); }
    public TextField createTextField() { return new LightTextField();}
}
