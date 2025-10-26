package designPattern.structural.decorator;

public class SimpleCoffee  implements Coffee{

    @Override
    public String getDescription() {
        return "Simple COffeee";
    }

    @Override
    public double getCost() {
        return 5.0;
    }
}
