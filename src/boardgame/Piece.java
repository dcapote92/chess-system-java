package boardgame;

public class Piece {

    protected Position position;
    private Board board;

    public Piece(Board board) {
        this.board = board;
        position = null; // é opcional, pois o java por padrão joga o valor null
    }

    protected Board getBoard() {
        return board;
    }


}
