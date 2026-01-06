package designPattern.creational.FactoryExample2.AbstractFactoryPattern;

public class Main {
    public static void main(String[] args) {
         String theme = "light"; // or "dark"
        WidgetFactory factory = theme.equals("light") ? new LightThemeFactory() : new DarkThemeFactory();
        Button button = factory.createButton();
        TextField textField = factory.createTextField();
    }

}
