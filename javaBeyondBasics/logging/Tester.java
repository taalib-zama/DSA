package logging;

public class Tester {
    //Now to test the functionality of the logger, we will create a new package, com.infy.userinterface, and in it,
    // we will create a Tester.java class file.
    public static void main(String[] args) {
        try {
            userAuthentication authentication = new userAuthentication();
            authentication.loginUser("Jon", "Asdf@123");
            System.out.println("User has logged in successfully");
        } catch(Exception exception) {
            System.out.println(exception.getMessage());
        }
    }
}
