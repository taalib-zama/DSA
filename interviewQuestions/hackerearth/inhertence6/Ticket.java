package hackerearth.inhertence6;

public class Ticket extends Membership{
    void price(){
        super.price();
        System.out.println("Ticket@$20");
    }

}
