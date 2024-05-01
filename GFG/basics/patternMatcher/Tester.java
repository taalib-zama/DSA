package basics.patternMatcher;

public class Tester {



    static boolean  follPatt(String s)
    {
        //as the input is only x nd y
        int xcount = 0;
        int ycount = 0;
        for(int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'x') {
                xcount++;
            } else if (s.charAt(i) == 'y') {
                ycount++;
            } else {
                //do nothing
            }
        }
        if(xcount == ycount){
            return true;
        }
        else {
            return false;
        }
    }
    public static void main(String[] args) {
        String str = "xxxyyyy";
        System.out.println(follPatt(str));
    }
}
