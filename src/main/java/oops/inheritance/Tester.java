package oops.inheritance;

public class Tester {
    public static void main(String[] args){
        HomeLoan hloan = new HomeLoan();
        double amount = hloan.calculateEMI(); //sub class object invoking super class method
        System.out.println("EMI per year is :"+amount);

        CarLoan cLoan = new CarLoan();
        double amount_c = cLoan.calculateEMI();
        System.out.println("EMI for car loan " +amount_c);

        VariableLoan vLoan = new VariableLoan(10,10000,2.5f,"123frd");
        double amount_v = vLoan.calculateEMI();
        System.out.println("Extra incentive on variable loan : " +vLoan.getIncentives());
    }
}
