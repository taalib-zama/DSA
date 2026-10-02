package JavaBasic;

public class PlayingWithVars {
    public static void main(String[] args) {
        // TODO: Define permission constants (1, 2, 4)
        var READ = 1;
        var WRITE = 2;
        var EXECUTE =  4;


        // TODO: Create userPerms by combining READ and WRITE using Bitwise OR (|)
        var userPerms = READ | WRITE;


        // TODO: Check if EXECUTE is present using Bitwise AND (&)
        var canExecute = (userPerms & EXECUTE) == EXECUTE;; // fix this line

        // TODO: Check if READ is present
        boolean canRead = (userPerms & READ) == READ;

        // TODO: Print the check results
        System.out.println("Can Execute: " + canExecute);
        System.out.println("Can Read: " + canRead);

        // TODO: Print the binary string of the permissions
        System.out.println("Binary Perms: " +Integer.toBinaryString(userPerms));
    }
}
