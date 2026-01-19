package educativeCourse.PassByReference;

public class SwapExampleForPassByReference {
    public void run() {
        Integer x = 5;
        Integer y = 9;
        System.out.println("Before Swap x: " + x + " y: " + y);
        swap(x, y);
        System.out.println("After Swap x: " + x + " y: " + y);
    }

    private void swap(Integer a, Integer b) {
        Integer temp = a;
        a = b;
        b = temp;
    }

    public static void main(String[] args) {
        SwapExampleForPassByReference example = new SwapExampleForPassByReference();
        example.run();
    }



    //The issue with the current implementation is that Java is pass-by-value, even for objects. When you pass Integer objects to the swap method, the references themselves are passed by value, so the changes to a and b inside the method do not affect the original variables x and y.  To fix this, you can use a wrapper class to hold the values, allowing the method to modify the actual values. Here's the corrected implementation:




    //Explanation:
    //A Wrapper class is introduced to hold the Integer values.
    //The swap method now takes Wrapper objects, allowing the method to modify the actual values inside the wrappers.
    //The value field of the Wrapper objects is swapped, which reflects the changes in the original variables.
}
