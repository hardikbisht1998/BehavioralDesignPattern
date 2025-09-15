package memento2Pattern;

public class MomentoTester {

    public void check() {
        ChessGame chessGame = new ChessGame("hardik", "Bisht");
        chessGame.save();
        System.out.println(chessGame.getChessBoard().toString());
        chessGame.getChessBoard().setWhiteTime(76767676);
        chessGame.save();
        System.out.println(chessGame.getChessBoard().toString());
        chessGame.undo();
        System.out.println(chessGame.getChessBoard().toString());

        chessGame.undo();
        System.out.println(chessGame.getChessBoard().toString());

        chessGame.redo();
        System.out.println(chessGame.getChessBoard().toString());

        chessGame.redo();
        System.out.println(chessGame.getChessBoard().toString());


    }
}
