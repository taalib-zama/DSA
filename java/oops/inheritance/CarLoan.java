package oops.inheritance;

public class CarLoan extends Loan {
    CarLoan(){
        super();
        tenure = 2;  //reusing super class member variables
        principal = 5000;
        interestRate = 3.5f;
        accountNo = "Acc12398";
    }
}
