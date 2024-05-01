package oops.polymorphism.overriding;

public class HomeLoan extends Loan{

    public double calculateEMI(double principal) {
        return 3600;
    }
}
