package operators;

public class LeaderBoard {
    public static void main(String[] args) {
        int playerScore1 = 95;
        int playerScore2 = 85;


        if (playerScore1 > playerScore2) {
            System.out.println("Player 1 is the winner");
        } else {
            System.out.println("Player 2 is the winner");
        }


        int player1Score = 95;
        int player2Score = 85;
        int player3Score = 73;
        if (player1Score > player2Score && player1Score > player3Score) {
            System.out.println("Player 1 is the top scorer.");
        } else if (player2Score > player1Score && player2Score > player3Score) {
            System.out.println("Player 2 is the top scorer.");
        } else {
            System.out.println("Player 3 is the top scorer.");
        }
    }
}
