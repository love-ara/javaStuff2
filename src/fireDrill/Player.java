package fireDrill;

public record Player(CellType cellType) {
    public void play(TicTacToe game, int move){
        game.makeMove(move);
    }

    @Override
    public String toString(){
        return  String.format("Player %s", cellType);
    }
}
