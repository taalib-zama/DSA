package polymorphism.MethodOverridingExercise;

public class Tester {
    public static void main(String[] args) {
        User jack = new User(101, "Jack", "jack@infy.com", 1000);  //common user

        //KYC user
        KYCUser jill = new KYCUser(201, "Jill", "jill@infy.com", 3000);

        //paymnets :
        EPayWallet.processPaymentByUser(jack, 700.0);
        EPayWallet.processPaymentByUser(jill, 1500);
        EPayWallet.processPaymentByUser(jill, 800);
        EPayWallet.processPaymentByUser(jill,1200);


    }
}
