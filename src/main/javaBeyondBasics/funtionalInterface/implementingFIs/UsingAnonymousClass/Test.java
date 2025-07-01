package funtionalInterface.implementingFIs.UsingAnonymousClass;

public class Test {
    Bird birdObject = new Bird() {
        @Override
        public void canFly(String fly) {
            System.out.println("Bird can fly " + fly);
        }
    };
    public static void main(String[] args) {
        Test test = new Test();
        test.birdObject.canFly("high");
        //using toString method
        System.out.println(test.birdObject.toString());
    }


}
