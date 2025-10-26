package designPattern.creational.FactoryExample2.AbstractFactoryPattern;

public class DarkThemeFactory implements WidgetFactory {
    public Button createButton() {
        return new DarkButton();
    }

    public TextField createTextField() {
        return new DarkTextField();
    }
}

