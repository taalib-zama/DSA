package snippets.bitwiseOperation;

public class BitwiseShiftExample {
    public static void main(String[] args) {
        int value = 1;
        int shiftCount = 35; // 35 % 32 = 3
        int result = value << shiftCount;
        System.out.println("Result of shifting 1 by 35 bits (int): " + result); // Output will be 8

        long longValue = 1L;
        int longShiftCount = 70; // 70 % 64 = 6
        long longResult = longValue << longShiftCount;
        System.out.println("Result of shifting 1 by 70 bits (long): " + longResult); // Output will be 64
    }
}
