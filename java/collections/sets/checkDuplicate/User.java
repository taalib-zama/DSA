package collections.sets.checkDuplicate;

public class User {
    private String username;
    private String password;
    private String email;

    public User(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
    }

    //overriding equals method which compares username of users to check if they are equal or not
	/*@Override
	public boolean equals(Object user) {
		User tempuser = null;
		boolean flag = false;
		if (user instanceof User) { //instanceof tests if passed object is of User class or not
			tempuser = (User) user;
			flag=this.email.equals(tempuser.email);
		}
		return flag;
	}*/

    //overriding hashCode() method to return length of username
	/*@Override
	public int hashCode() {
		return username.length();
	}*/

    //overriding hashCode() to print username and email when User object reference is printed
    @Override
    public String toString() {
        return this.username + " : " + this.email;
    }
}
