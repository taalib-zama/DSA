package polymorphism.MethodOverridingExercise;
import lombok.*;
@Getter
@Setter

public class KYCUser extends User{
    private int rewardPoints;
    public KYCUser(int id,String username, String email, double walletBalance){
        super(id, username, email, walletBalance);
    }
    @Override
    public boolean makePayment(double billAmount){
        if(super.makePayment(billAmount)==true){
            rewardPoints = rewardPoints + (int) ((billAmount*10)/100.0);
            return true;
        }
        else{
            return false;
        }
    }

}
