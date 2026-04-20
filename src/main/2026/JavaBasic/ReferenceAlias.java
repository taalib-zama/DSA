package JavaBasic;

public class ReferenceAlias {
    public static void main(String[] args) {
        // Create a modifiable string containing "Start"
        StringBuilder ref1 = new StringBuilder("Start");

        // Copy the address from ref1 to ref2
        StringBuilder ref2 = ref1;

        // Change the text using ref2
        ref2.append("+End");

        // ref1 sees the change because it points to the same object
        System.out.println("ref1: " + ref1);


        // Use the boxed Long type so getClass() is valid (var would infer primitive long)
        Long x = 1_00_000L;
        System.out.println(x.getClass());
    }

}
