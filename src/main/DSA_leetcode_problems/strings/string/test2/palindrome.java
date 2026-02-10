package strings.string.test2;

public class palindrome {
    public static void main(String[] args) {
        String str = "madam";
        String rev = "";
        if(str.length() == 0 || (str.length() % 2) == 0){
            System.out.println("No");
        }
        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }


    }
}
