package oops.inheritance;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class VariableLoan extends Loan {
    private int incentives;
    public VariableLoan(int tenure, double principal, float interestRate, String accountNo){
        super(tenure, principal, interestRate, accountNo);
        this.incentives = 2400;
        System.out.println("Child Constructor");

    }

}
