package polymorphism.MethodOverridingExercise;
import lombok.*;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private int id;
    private String username;
    private String email;
    private double walletBalance;

    public boolean makePayment(double billAmount){
        if(this.walletBalance < billAmount){
            return false;
        }
        else{
            this.walletBalance = this.walletBalance - billAmount;
            return true;
        }
    }
}
