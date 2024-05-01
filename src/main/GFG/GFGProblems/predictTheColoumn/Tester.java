package GFGProblems.predictTheColoumn;



public class Tester {
    public static void main(String[] args) {

        // Define the dimensions of the 2D array
        int n = 3;

        // Create the 2D array and initialize it with the given data
        int[][] twoDArray = {
                {0, 1, 0},
                {0, 0, 0},
                {0, 1, 0}
        };

        System.out.println("Max number of zeros coloumn : "  +Solution.columnWithMaxZero(twoDArray,n));
    }
}
