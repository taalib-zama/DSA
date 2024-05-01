package GFGProblems.matrixInterchnage;

public class Tester {
    public static void main(String[] args) {
        // Define the dimensions of the 2D array
        int rows = 3;
        int columns = 4;

        // Create the 2D array and initialize it with the given data
        int[][] twoDArray = {
                {1, 2, 3, 4},
                {4, 3, 2, 1},
                {6, 7, 8, 9}
        };
        Solution.interchange(twoDArray, rows, columns);
    }
}
