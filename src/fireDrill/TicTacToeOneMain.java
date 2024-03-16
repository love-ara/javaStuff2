//package fireDrill;
//
//import javax.swing.*;
//
//
//public class TicTacToeOneMain {
//    private static TicTacToeOne gameOne;
//
//    public static void main(String[] args) {
//        start();
//    }
//
//    private static  void start(){
//        print("Welcome", "Welcome");
//        selectType();
//    }
//    public static void play(){
//        Player playerOne = gameOne.getPlayers()[0];
//        Player playerTwo = gameOne.getPlayers()[1];
//
//
//        print("Let's start ", "let's begin");
//        while (!gameOne.isWin() && !gameOne.isDraw()) {
//            try {
//
//                System.out.println(gameOne.displayBoard());
//                int id = 0;
//                String playerOnePosition = input("Player 1, select a position (1-9)");
//                int move = Integer.parseInt(playerOnePosition);
//                playerOne.play(gameOne, move);
//                //System.out.printf("It' s your turn, Player %s%n", game.currentPlayer().name());
//                //System.out.print("Enter your move (1-9): ");
//                //int move = input.nextInt();
//
//
//                if (!gameOne.makeMove(id, move)) {
//                    throw new InvalidPositionException("Invalid move, Try again");
//                }
//
//            } catch (RuntimeException e) {
//                System.out.println(e.getMessage());
//            }
//        }
//        System.out.println(gameOne.displayBoard());
//        while(!gameOne.isWin() && !gameOne.isDraw()) {
//            String playerTwoPosition = input("Player 2, select a position (1-9)");
//            playerTwo.play(gameOne, Integer.parseInt(playerTwoPosition));
//            print(gameOne.displayBoard(), "Display board");
//        }
//
//
//        if(gameOne.isWin()){
//            CellType winner;
//            winner = gameOne.getPlayer(id) == CellType.X? CellType.O : CellType.X;
//            System.out.printf("Player %s Wins!", winner);
//        }else{
//            System.out.println("It's a draw!");
//        }
//
//    }
//    private static void selectType(){
//        int playerChoice = JOptionPane.showConfirmDialog(null, "Do you want to play X?", "Select an option", JOptionPane.YES_NO_OPTION);
//
//        if (playerChoice == JOptionPane.YES_OPTION) gameOne = new TicTacToeOne(1, 2);
//        else gameOne = new TicTacToeOne(2, 1);
//
//        Player playerOne = gameOne.getPlayers()[0];
//        Player playerTwo = gameOne.getPlayers()[1];
//
//        print("Player 1, you are " + playerOne.cellType(), "Info");
//        print("Player 2, you are " + playerTwo.cellType(), "Info");
//        print(gameOne.displayBoard(), "Display board");
//
//
//        play();
//
//
//    }
//    private static void print(String message, String title){
//        JOptionPane.showMessageDialog(null, message, title,JOptionPane.INFORMATION_MESSAGE);
//    }
//    private static String  input(String message){
//        return JOptionPane.showInputDialog(null, message, "Make your move", JOptionPane.QUESTION_MESSAGE);
//    }
//}
//
//
//
//
//
//
//
//
//package ticTacToe;
//
//import javax.swing.*;
//
//public class Main {
//    private static TicTacToe game;
//
//    public static void main(String[] args) {
//        startApp();
//
//    }
//
//    private static void startApp() {
//        print("Game loading...", "Welcome, players");
//
//        selectType();
//    }
//
//    private static void selectType() {
//        int userChoice = JOptionPane.showConfirmDialog(null, "Player 1, do you want to use X?",
//                "Select option", JOptionPane.YES_NO_OPTION);
//
//        if (userChoice == JOptionPane.YES_OPTION) game = new TicTacToe(1, 2);
//        else game = new TicTacToe(2, 1);
//
//        Player playerOne = game.getPlayers()[0];
//        Player playerTwo = game.getPlayers()[1];
//
//        print("Player 1, you are " + playerOne.cellType(), "Info");
//        print("Player 2, you are " + playerTwo.cellType(), "Info");
//        print(game.displayBoard(), "Display board");
//
//        playGame();
//    }
//
//    private static void playGame() {
//        Player playerOne = game.getPlayers()[0];
//        Player playerTwo = game.getPlayers()[1];
//
//        boolean continueGame = true;
//        while (continueGame) {
//            try {
//                String playerOnePosition = input("Player 1, select a position (1-9)");
//                playerOne.play(game, Integer.parseInt(playerOnePosition));
//                print(game.displayBoard(), "Display board");
//
//                checkGameStatus();
//                continueGame = false;
//            }
//            catch (RuntimeException e) {
//                displayErrorMessage(e);
//            }
//        }
//
//        continueGame = true;
//        while (continueGame) {
//            try {
//                String playerTwoPosition = input("Player 2, select a position (1-9)");
//                playerTwo.play(game, Integer.parseInt(playerTwoPosition));
//                print(game.displayBoard(), "Display board");
//
//                checkGameStatus();
//                continueGame = false;
//            }
//            catch (RuntimeException e) {
//                displayErrorMessage(e);
//            }
//        }
//
//        boolean gameIsOn = game.getWinner() == null && !game.isBoardFull();
//        if (gameIsOn) playGame();
//    }
//
//    private static void displayErrorMessage(RuntimeException e) {
//        JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
//    }
//
//    private static void checkGameStatus() {
//        boolean isWinnerNull = game.getWinner() == null;
//
//        if (!isWinnerNull) declareWinner();
//        if (game.isBoardFull()) declareDraw();
//    }
//
//    private static void declareDraw() {
//        print("Game ended in a draw", "Status");
//        exit();
//    }
//
//    private static void exit() {
//        print("Thank you for playing our game!!!", "Goodbye");
//        System.exit(0);
//    }
//
//    private static void declareWinner() {
//        print(game.getWinner().toString() + " is the winner!!!", "Champion");
//        exit();
//    }
//
//    private static void print(String message, String title) {
//        JOptionPane.showMessageDialog(null, message, title, JOptionPane.INFORMATION_MESSAGE);
//    }
//
//    private static String input(String message) {
//        return JOptionPane.showInputDialog(null, message, "Make your move", JOptionPane.QUESTION_MESSAGE);
//    }
//
//}
