package designPattern.creational.factoryPattern;

public class ShapeFactory {
    public Shape getFoodBasedOnShape(String type){
        if (type == null) {
            return null;
        }
        switch (type.toLowerCase()) {
            case "Round":
                return new Pizza();
            case "Cylinder":
                return new Burrito();
            default:
                throw new IllegalArgumentException("unknown shape");
        }
    }
}
