import java.util.Random;

/**
 * TicTacToe
 * UC2 performs a random toss to decide who plays first and assigns
 * symbols (X or O) to the human and computer accordingly.
 */
public class TicTacToe {

    static boolean isHumanTurn;
    static char humanSymbol;
    static char computerSymbol;

    /**
     * Entry point of the program.
     */
    public static void main(String[] args) {
        tossAndAssignSymbols();
        displayTossResult();
    }

    /**
     * Uses random logic to decide the first player
     * and assigns symbols accordingly.
     */
    static void tossAndAssignSymbols() {

        Random random = new Random();

        // Random toss (0 or 1)
        int toss = random.nextInt(2);

        if (toss == 0) {
            // Human wins toss
            isHumanTurn = true;
            humanSymbol = 'X';
            computerSymbol = 'O';
        } else {
            // Computer wins toss
            isHumanTurn = false;
            humanSymbol = 'O';
            computerSymbol = 'X';
        }
    }

    /**
     * Displays toss result and assigned symbols.
     */
    static void displayTossResult() {

        System.out.println("===== TIC TAC TOE =====");

        if (isHumanTurn) {
            System.out.println("Human won the toss!");
            System.out.println("Human plays first.");
        } else {
            System.out.println("Computer won the toss!");
            System.out.println("Computer plays first.");
        }

        System.out.println("Human Symbol: " + humanSymbol);
        System.out.println("Computer Symbol: " + computerSymbol);
    }
}