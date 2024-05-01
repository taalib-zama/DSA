package collections.sets.userdefinedObjectComp;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Tester {
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

        //printing all users from set.
        for (User user : userSet) {
            System.out.println(user.username + " " + user.password + " " + user.email );
        }


    }
}
