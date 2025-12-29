package backlog.gfg.lambdas;

/**
 * helperfunction
 */
public class helperfunction {

    public static Hello helperFunction() {
        //Implement sayHello using lambda expression and return the object.Write this in the lambda expression: System.out.println("Hello")
        return () -> System.out.println("Hello");
    }
}