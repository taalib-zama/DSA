package arrays.factorialUsingRecursion;

public class Factorial {
    public static void main(String[] args) {

    }
    //demo for using iterative method.
    public static int interativeFactorial(int num){
        if(num == 0){
            return 1;
        }
        int factorial = 1;
        for(int i = 1 ; i <= num ; i++){
            factorial *= i;
        }
        return factorial;
    }
    // n! = n * (n-1)!.
    public  static  int recursiveFactorial(int num){
        if(num == 0)
            return 1;
        return num* recursiveFactorial(num -1);
    }
}
