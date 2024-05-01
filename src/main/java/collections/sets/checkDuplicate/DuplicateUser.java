package collections.sets.checkDuplicate;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class DuplicateUser {
    public static void main(String[] args) {
        // creating a list of users
        List<User> userList = new ArrayList<User>();
        userList.add(new User("Max", "fgc123", "max@infy.com"));
        userList.add(new User("Mike", "hdgsh@", "imike@infy.com"));
        userList.add(new User("John", "ucantseeme", "jojo@infy.com"));
        userList.add(new User("Moby", "fgc123", "iammoby@infy.com"));
        userList.add(new User("Moby", "fgc123", "iammoby@infy.com"));

        // creating user set from list
        Set<User> userSet = new LinkedHashSet<User>();
        userSet.addAll(userList);

        //printing all users
        for (User user : userSet) {
            System.out.println(user);
        }
    }
}


////Step1: execute the program, observe objects printed
////Step2: uncomment equals() and hashCode(), observe objects printed