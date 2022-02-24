public class TicTacToe {

    public static void main(String[] args) {
        
        char[][] gameBoard = {
            {' ', '|', ' ', '|', ' '}, 
            {'-', '+', '-', '+', '-'}, 
            {' ', '|', ' ', '|', ' '}, 
            {'-', '+', '-', '+', '-'}, 
            {' ', '|', ' ', '|', ' '}};

        printGameBoard(gameBoard);

    }

    // Prints tic-tac-toe board out in the console
    public static void printGameBoard(char[][] gameBoard) {
                for(char[] row : gameBoard) {
            for(char c : row) {
                System.out.print(c);
            }
            System.out.println();
        }
    }

}