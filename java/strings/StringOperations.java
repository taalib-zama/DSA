package strings;

public class StringOperations {
    public static void main(String[] args) {
        String name = "Thomas";
        String customerName = new String("THOMAS");
        boolean result1 = name.equals(customerName);     // result1 = false
        boolean result2 = name.equalsIgnoreCase(customerName);  //result2 = true

        String username = name.concat("#24");  // will concatenate #24 to name i.e Thomas#24
        String newString = customerName.replace("M", "m"); // Will replace all occurence of M to m
        // i.e THOmAS

        //********************************************************************************************

        //creation of string using string literal
        String firstString = "Java";

        //creation of string using new keyword
        String secondString = new String("Stream");

		/*
		Task 1 :- using concat() display Java Stream
		*/
        System.out.println("------------"+"concat()"+"------------");
        System.out.println("Concatenating using concat() :- "+firstString.concat(secondString));
        System.out.println();

		/*
		Task 2 :- string comparison using equals(), == operator, compareTo()
		*/
        System.out.println("------------"+"Comparison(.equals , == , compareTo)"+"------------");
        String thirdString = "Thomas";
        String fourthString = "THOMAS";

        System.out.println("Comparison of Thomas with THOMAS using equals :- "+thirdString.equals(fourthString));
        //string1.equalsIgnoreCase(string2) => case insensitive comparison
        System.out.println("Comparison of Thomas with THOMAS using equals ignoring case:- "+thirdString.equalsIgnoreCase(fourthString));

        System.out.println();
        //using == operator
        String fifthString = "Thomas";
        String sixthString = new String("Thomas");

        System.out.println("Comparison using == operator :- "+(thirdString==fifthString));
        //Line 36 both refer to same instance

        System.out.println("Comparison using == operator with new keyword :- "+(sixthString==fifthString));
        //Line 39 sixthString refers to instance created in nonpool

        System.out.println();
        //using compareTo()

		/*
			if s1 and s2 are two strings which are to be compared
			if s1 == s2 then output is 0
			if s1 > s2 then output is 1
			if s1 < s2 then output is -1
		*/

        /*
		Task 1 :- Other String methods like toUpperCase(),toLowerCase(),isEmpty(),startsWith(),endsWith(),length()

		*/
        System.out.println("------------"+"Other String methods"+"------------");
        String car = "Mercedes";
        System.out.println("To upper case :- "+car.toUpperCase());
        System.out.println("To lower case :- "+car.toLowerCase());
        System.out.println();
        //Tryout different scenarios of startsWith and endsWith
        System.out.println("Check whether string starts with Merc :- "+car.startsWith("Merc"));
        System.out.println("Check whether string ends with des :- "+car.endsWith("des"));

        System.out.println();
        System.out.println("Check whether a string is empty");
        System.out.println("for string car :- "+car.isEmpty());
        String str = "";
        System.out.println("for string str :- "+str.isEmpty());
        System.out.println();

        System.out.println("To calculate length of string we use length()");
        System.out.println("Length of string car is :- "+car.length());
        System.out.println();
		/*
		Task 2 :- substring(),split(),indexOf(),trim(),replace()

		*/
        System.out.println("------------"+"substring(),split(),indexOf(),trim(),replace()"+"------------");

        String forest = "Grand Canyon National Park";
        System.out.println();
        System.out.println("substring(2,6) of string forest :- "+forest.substring(2,6));
        //It gives the characters in string from startpoint i.e 2 to 6 which is endpoint

        System.out.println();
        System.out.println("split() will split the string into String array based on the character given in parameter");
        String[] words = forest.split(" ");
        //It will split the string forest based on white spaces
        for(String w:words){
            System.out.println(w);
        }

        System.out.println();
        System.out.println("indexOf() returns the index of substring passed as parameter");
        System.out.println("forest.indexOf(Canyon) will give result as :- "+forest.indexOf("Canyon"));

        System.out.println();
        String s1 = "   Amazon ";
        System.out.println("trim() is used to remove the leading and trailing white-spaces");
        System.out.println("s.trim() will give result as :- "+s1.trim());

        System.out.println();
        System.out.println("replace() method replaces the string according to the given parameters");
        System.out.println("forest.replace('a','e') will give result as :- "+forest.replace("a", "e"));
        //replacing all the occurences of a to e

        System.out.println("Comparison of Thomas and Thomas using comapreTo :- "+(thirdString.compareTo(fifthString)));
        System.out.println("Comparison of Thomas and RudolfShelby using compareTo :- "+(thirdString.compareTo("RudolfShelby")));
        //************************************************************************************************************
        //*************************************************************************************

        System.out.println('a' + 'b');
        System.out.println("a" + "b");
        System.out.println((char)('a' + 3));

            System.out.println("a" + 1);
            // this is same as after a few steps: "a" + "1"
            // integer will be converted to Integer that will call toString()

 //           System.out.println("Kunal" + new ArrayList<>());
 //           System.out.println("Kunal" + new Integer(56));
//            String ans = new Integer(56) + "" + new ArrayList<>();  //not possible
//            System.out.println(ans);

            System.out.println("a" + 'b');
        }
    }

