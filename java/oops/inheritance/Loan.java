package oops.inheritance;

public class Loan {
    int tenure;
    double principal;
    float interestRate;
    String accountNo;

    Loan(){
        System.out.println("Super class constructor called");
    }
    Loan(int tenure, double principal, float interestRate, String accountNo){
        this.tenure = tenure;
        this.principal = principal;
        this.interestRate = 5.0f;
        this.accountNo = accountNo;
    }

    public double calculateEMI(){
        double simpleInterest = (principal*interestRate*tenure)/100;
        return (simpleInterest+principal)/tenure;
    }
}
