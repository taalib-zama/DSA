package educativeCourse.PassByReference;

public class SwapUsingWrapper {

    static class Wrapper {
        Integer value;

        Wrapper(Integer value) {
            this.value = value;
        }
    }

    public void run() {
        Wrapper x = new Wrapper(5);
        Wrapper y = new Wrapper(9);
        System.out.println("Before Swap x: " + x.value + " y: " + y.value);
        swap(x, y);
        System.out.println("After Swap x: " + x.value + " y: " + y.value);
    }

    private void swap(Wrapper a, Wrapper b) {
        Integer temp = a.value;
        a.value = b.value;
        b.value = temp;
    }

    public static void main(String[] args) {
        SwapExampleForPassByReference example = new SwapExampleForPassByReference();
        example.run();
    }

}
