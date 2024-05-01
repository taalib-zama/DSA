package oops.polymorphism.overriding;

public class Tester {
    public static void main(String[] args) {
        Loan loan = null;
        loan = new HomeLoan();
        double emi1 = loan.calculateEMI(200);
        loan = new VehicleLoan();
        double emi2 = loan.calculateEMI(400);
        System.out.println("Home loan emi per year" + emi1);
        System.out.println("Vehicle loan emi per year" +emi2);
    }
}
