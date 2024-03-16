package fireDrill;


public record Player(int id, CellType cellType) {
    public void play(TicTacToeOne game, int move){
        game.makeMove(this.id, move);
    }

    @Override
    public String toString(){
        return  String.format("Player %s", cellType);
    }

    public int id() {
        return 0;
    }
}




