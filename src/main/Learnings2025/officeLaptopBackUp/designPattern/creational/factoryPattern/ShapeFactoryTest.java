package designPattern.creational.factoryPattern;


public class ShapeFactoryTest {
    ShapeFactory shapeFactory = new ShapeFactory();
    Shape roundFood = shapeFactory.getFoodBasedOnShape("Round");
    Shape cylinderFood = shapeFactory.getFoodBasedOnShape("Cylinder");
/*
    @Test
    public void shapeFactoryMethodTest() {

        assertEquals(roundFood.getShape(), "Round Pizza");
        assertEquals(cylinderFood.getShape(), "Cylinder");
    }*/




}
