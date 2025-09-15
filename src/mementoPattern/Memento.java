package mementoPattern;

public class Memento {
    private ChessBoard chessBoard;

    public Memento(ChessBoard chessBoard) {
        this.chessBoard = new ChessBoard(chessBoard); // Deep copy
    }


    public ChessBoard getChess() {
        return chessBoard;
    }

    public void setChess(ChessBoard chessBoard) {
        this.chessBoard = chessBoard;
    }


    @Override
    public String toString() {
        return "Momento of chess board [ " + chessBoard + " ] ";
    }
}
