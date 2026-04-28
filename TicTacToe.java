public class TicTacToe {

    static boolean isHumanTurn = true;
    static boolean gameOver = false;

    public static void main(String[] args) {

        int turns = 0;

        while (!gameOver) {

            if (isHumanTurn) {
                System.out.println("Human Turn");
            } else {
                System.out.println("Computer Turn");
            }

            turns++;

            if (turns == 5) {
                gameOver = true;
            } else {
                isHumanTurn = !isHumanTurn;
            }
        }
    }
}