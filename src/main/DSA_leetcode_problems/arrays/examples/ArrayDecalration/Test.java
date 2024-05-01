package arrays.examples.ArrayDecalration;

public class Test {
    public static void main(String[] args) {
        int[] intArray = new int[7];
        intArray[0] = 1;
        intArray[1] =  27;
        intArray[4] = 3;
        intArray[6] = 765;
        for(int i : intArray){
            System.out.println(i);
        }
    }
}
