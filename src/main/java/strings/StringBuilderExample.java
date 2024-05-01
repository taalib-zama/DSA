package strings;

public class StringBuilderExample {
    public static void main(String[] args) {
        //StringBuilder is a mutable sequence of characters.Only 1 object is made and changes are made to it.
        // Reference is also same.Some of its methods like insert(), append(), capacity(), delete(), length() are discussed.
        //Creating StringBuilder Objects
        StringBuilder strOne = new StringBuilder("Java");
        StringBuilder strTwo = new StringBuilder();
        strTwo.append("Python");
        // method will return length of strOne
        Integer length = strOne.length();

        //method will insert a new string to the original string
        strTwo.insert(0,"I love ");
        System.out.println(strTwo);

        // method will append 2.0
        strOne.append(9.0);
        System.out.println(strOne);

        //to print the capacity of object we use capacity()
        System.out.println(strOne.capacity());

        //this method will insert SE into strOne at specified position
        strOne.insert(length,"SE");
        System.out.println(strOne);

        //this method will create a string from start index till end index as specified
        String sub = strTwo.substring(4,9);
        System.out.println(sub);

        //this method can convert StringBuilder Object
        String str = strTwo.toString();
        System.out.println(str.getClass());

        // this method deletes characters from strOne based on the arguments specified
        System.out.println("String before deletion : " +strOne);
        strOne.delete(0,2);
        System.out.println(strOne);

    }
}
