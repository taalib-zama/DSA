package hackerearth;

public class third {
    public static void main(String[] args) {
        try {
            int a = args.length;
            int b = 10 / a;
            System.out.print(a);
            try {
                if (a == 1) {
                    a = a / a - a;
                }
                if (a == 2) {
                    int[] c = {1};
                    c[8] = 9;
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("type A");
            } catch (ArithmeticException e) {
                System.out.println("Type B");
            }
        }
        catch (Exception e){
            return;
        }

        //compilation error - no catch block for parent try.
    }
}
