package bigInteger;

import java.math.BigInteger;

public class test1 {
    public static void main(String[] args) {
        BigInteger A,B;
        int a = 54;
        BigInteger C = BigInteger.valueOf(a);       //casting int to BigInteger
        A = new BigInteger("88");   //for integers as strings
        B  = BigInteger.valueOf(37);
        
        C = A.add(B);

    }
}
