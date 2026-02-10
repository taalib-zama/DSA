package strings.string.test1;

public class Test {
    {
        System.out.println("A");
    }
    static {
        System.out.println("C");
    }
    Test(){
        System.out.println("L");
    }
    Test(int i){
        this();
    }
}
