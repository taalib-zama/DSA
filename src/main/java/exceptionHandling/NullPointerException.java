package exceptionHandling;

public class NullPointerException {
    public static void main(String[] args) {
        Integer totalValue = calculate(45);
        System.out.println(totalValue.intValue());
    }

    private static Integer calculate(int i) {
        return null;
    }
}
