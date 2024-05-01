package polymorphism.MethodOverridingExercise;

public class EPayWallet extends User{
    public static void processPaymentByUser(User user, double billAmount){
        if(user.makePayment(billAmount)) {
            System.out.println("Congratulations " + user.getUsername() + ", " + "payment of " + billAmount
                    + " was successful.");
        } else if (user.makePayment(billAmount) == false) {
            System.out.println("Sorry " +user.getUsername() + ", " +"not enough balance to make payment.");
        }
        else{
            //do nothing.
        }
        System.out.println("Your wallet balance is " + user.getWalletBalance());
        if(user instanceof KYCUser){
            System.out.println("You have "+((KYCUser) user).getRewardPoints() + " reward points");
        }
        System.out.println("******************************************************************");
    }
}
