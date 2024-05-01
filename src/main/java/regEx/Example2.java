package regEx;
//note : check problemStetement for instructions.
public class Example2 {
    public static void main(String[] args) {
        //Personal Details:
        String name = "Leeroy Jenkins";
        String emailId = "leeroy.jenkins@wow.com";
        String userId = "leeroy#78jenkins";
        String accSerialId = "WoW-ABilOpZ00523ABilOpZ_a00Z9";
    //************************************************************************
        //Splitting Full Name Into an Array:
        String[] nameSplit = name.toLowerCase().split(" ");

        /**
         * 		Regular Expression for each field according to the requirements:
         */
        //Regular Expression for Name Validation:
        String nameRegex = "([A-Za-z ]+)";
        //Regular Expression for Email Id Validation:
        String emailIdRegex = nameSplit[0]+"."+nameSplit[1]+"[@]([a-z]+)[.](com|in)";
        //Regular Expression for User Id Validation:
        String userIdRegex = nameSplit[0]+"[#]([0-9]{2})"+nameSplit[1];
        //Regular Expression for Account Serial Id Validation:
        String accSerialRegex = "(WoW)[-]([A-Za-z]{7})(\\d{5})\\2[_]([A-Za-z0-9]{5})";
///**************************************************************************************************

        /**
         * 		Matching the Personal Details with the pattern specified:
         */
        //Validating Name:
        System.out.println("Does the name ("+name+") match the pattern? : "+name.matches(nameRegex));
        //Validating Email Id:
        System.out.println("Does the email ID ("+emailId+") match the pattern? : "+emailId.matches(emailIdRegex));
        //Validating User Id:
        System.out.println("Does the user ID ("+userId+") match the pattern? : "+userId.matches(userIdRegex));
        //Validating Account Serial Id:
        System.out.println("Does the account serial ID ("+accSerialId+") match the pattern? : "+accSerialId.matches(accSerialRegex));
    }

}
