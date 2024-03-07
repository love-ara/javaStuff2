package fireDrill;

import javax.swing.*;
import java.util.Scanner;

public class TicTacToeMain {
    private static TicTacToe game = new TicTacToe();

    public static void main(String[] args) {
        play();
    }

    public static void play(){

        print("Let's start ", "Play");
        while (!game.isWin() && !game.isDraw()) {
            try {

                print(game.displayBoard(), "board");
                print("It' s your turn, Player " + game.currentPlayer().name(), "turn");
                String  payerMove = input("Enter your move (1-9): ");
                int move = Integer.parseInt(payerMove);

                if (!game.makeMove(move)) {
                    throw new InvalidPositionException("Invalid move, Try again");
                }

            } catch (RuntimeException e) {
                displayErrorMessage(e);
            }
        }
        print(game.displayBoard(), "board");

        if(game.isWin()){
            CellType winner;
            winner = game.currentPlayer() == CellType.X? CellType.O : CellType.X;
            print( "Player " + winner + " Wins!", "Winner");
        }else{
            print("It's a draw!", "Tie!");
        }

    }

    private static void print(String message, String title){
        JOptionPane.showMessageDialog(null, message, title,JOptionPane.INFORMATION_MESSAGE);
    }
    private static String  input(String message){
        return JOptionPane.showInputDialog(null, message, "Make your move", JOptionPane.QUESTION_MESSAGE);
    }
    private static void displayErrorMessage(RuntimeException e) {
          JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
      }
}
