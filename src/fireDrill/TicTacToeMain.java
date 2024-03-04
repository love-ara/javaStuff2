package fireDrill;

import java.util.Scanner;

public class TicTacToeMain {
    private static TicTacToe game = new TicTacToe();

    public static void main(String[] args) {
        play();
    }
    public static void play(){
        Scanner input = new Scanner(System.in);
        System.out.println("Let's start ");
        while (!game.isWin() && !game.isDraw()) {
            try {

                System.out.println(game.displayBoard());
                System.out.printf("It' s your turn, Player %s%n", game.currentPlayer().name());
                System.out.print("Enter your move (1-9): ");
                int move = input.nextInt();

                if (!game.makeMove(move)) {
                    throw new InvalidPositionException("Invalid move, Try again");
                }

            } catch (RuntimeException e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println(game.displayBoard());

        if(game.isWin()){
            CellType winner;
            winner = game.currentPlayer() == CellType.X? CellType.O : CellType.X;
            System.out.printf("Player %s Wins!", winner);
        }else{
            System.out.println("It's a draw!");
        }

    }
}
