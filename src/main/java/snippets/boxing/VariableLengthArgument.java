package snippets.boxing;

public class VariableLengthArgument {

        public static void printVariable(String... args) {
            String[] var1 = args;
            int var2 = args.length;

            for(int var3 = 0; var3 < var2; ++var3) {
                String s = var1[var3];
                System.out.println(s);
            }

        }
        // ......
        public static void main(String[] args) {
            printVariable("Hello", "World", "Java");
        }

}
