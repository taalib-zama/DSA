package backlog.datastructures.stacks.validparenthesis;

public class Tester {
    public static void main(String[] args) {
        String s = "()";
        System.out.println("Checking if valid or not");
        if(Solution.isValid(s)){
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
    }
}
