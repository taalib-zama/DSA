package LambdaExpressions.Calculator;

public class Solution {
    public static void main(String[] args) {
        Operation add = (x,y) -> x+y;
        Operation subtract = (x,y) -> x-y;
        Operation multiply = (x,y) -> x*y;
        Operation divide = (x,y) -> x/y;

        System.out.println("Result is: "+doOperation(12, 4, multiply));
    }

    public static double doOperation(double firstNum, double secondNum, Operation operator) {
        return operator.opCriteria(firstNum, secondNum);
    }

}
