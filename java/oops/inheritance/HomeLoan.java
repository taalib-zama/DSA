package oops.inheritance;

public class HomeLoan extends Loan {
    HomeLoan(){
        tenure = 5;  //reusing super class member variables
        principal = 20000;
        interestRate = 8.5f;
        accountNo = "Acc12345";
    }
}
