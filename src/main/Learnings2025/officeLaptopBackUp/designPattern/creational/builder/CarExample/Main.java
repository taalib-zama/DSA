package designPattern.creational.builder.CarExample;

public class Main {
    public static void main(String[] args) {
        Car car = new Car.CarBuilder()
                .make("Toyota")
                .model("Camry")
                .year(2023)
                .color("Blue")
                .sunroof(true)
                .navigationSystem(true)
                .build();

        System.out.println(car);
    }
}
