package fireDrill;


import java.util.Arrays;

public class TicTacToeOne {
    private Player[] players = new Player[2];
    private CellType[][] board = new CellType[3][3];
    private CellType currentPlayer;

    public TicTacToeOne(int playerOneId, int playerTwoId) {
        CellType playerOneCellType = playerOneId == 1 ? CellType.X : CellType.O;
        CellType playerTwoCellType = playerTwoId == 2 ? CellType.O : CellType.X;

        players[0] = new Player(1, playerOneCellType);
        players[1] = new Player(2, playerTwoCellType);

        for(CellType[] smallerBoard: board){
            Arrays.fill(smallerBoard, CellType.EMPTY);
        }
    }


    public String displayBoard() {
        StringBuilder output = new StringBuilder();
        for (int row = 0; row < 3; row++) {
            for (int column = 0; column < 3; column++) {
                output.append("   ").append(board[row][column]);
            }
            output.append("\n");
        }

        return output.toString();
    }
    public boolean isValidMove(int move){
        if(move >= 1 && move <= 9) return true;
        throw new InvalidMoveException("Move should be 1 - 9");
    }

    public boolean makeMove(int id, int move){
        if(isValidMove(move)){
            int row = move %  3 == 0? (move / 3) - 1 : move / 3;
            int column = move % 3 == 0 ? 2 : (move % 3) - 1;

            validatePosition(row, column);
            Player player = getPlayer(id);
            board[row][column] = player.cellType();
            //player = (player == CellType.X) ? CellType.O : CellType.X;
            return true;
        }
        return false;
    }

    private void validatePosition(int row, int column) {
        if(board[row][column] != CellType.EMPTY) throw new InvalidPositionException("Position is already taken");
    }

    public boolean isWin(){
        for (int row = 0; row < 3; row++){
            if ((board[row][0] == board[row][1] && board[row][1] == board[row][2] && board[row][0] != CellType.EMPTY) ||
                    (board[0][row] == board[1][row] && board[1][row] == board[2][row] && board[0][row] != CellType.EMPTY)) {
                return true;
            }
        }
        if(board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[0][0] != CellType.EMPTY ||
                board[0][2] == board[1][1] && board[1][1] == board[2][0] && board[0][2] != CellType.EMPTY                          ){
            return true;
        }
        return false;
    }
    public boolean isDraw(){
        for(int row = 0; row  < 3; row ++){
            for (int column = 0; column < 3; column++){
                if(board[row][column] == CellType.EMPTY) return false;
            }
        }
        return true;
    }

    private Player getPlayer(int playerId) {
        if (players[0].id() == playerId) return players[0];
        return players[1];
    }

    public Player[] getPlayers() {
        return players;
    }

    public CellType[][] getBoard() {
        return board;
    }


}






