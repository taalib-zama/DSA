package collections.sets.userdefinedObjectComp;

public class User {
    String username;
    String password;
    String email;
    User(String uname, String pass, String email){
        this.email = email;
        this.password = pass;
        this.username = uname;

    }
    //removing the duplicated by overriding equals and hashcode methods.
    @Override
    public boolean equals(Object user) {
        User tempuser = null;
        boolean flag = false;
        if (user instanceof User) { //instanceof tests if passed object is of User class or not
            tempuser = (User) user;
            flag=this.username.equals(tempuser.username);
        }
        return flag;
    }
    @Override
    public int hashCode() {
        return username.length();
    }
}
