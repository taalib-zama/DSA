package lambdaExpressions.functionalInterface;

public class Test {
    //functional interface implementation demonstration.
    public static void main(String args[]) {
        // create anonymous inner class object
//        new Thread(new Runnable() {
//            @Override public void run()
//            {
//                System.out.println("New thread created");
//            }
//        }).start();
//    }


        //Java 8 onwards, we can assign lambda expression to its functional interface object like this
        {

            // lambda expression to create the object
            new Thread(() -> {
                System.out.println("New thread created");
            }).start();
        }
    }
}
