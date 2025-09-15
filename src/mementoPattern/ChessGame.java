package mementoPattern;

public class ChessGame {
    private ChessBoard chessBoard;
    private String blackName, whiteName;
    CareTakerStore careTakerStore = new CareTakerStore();

    public ChessGame(String blackName, String whiteName) {
        this.chessBoard = new ChessBoard();
        this.blackName = blackName;
        this.whiteName = whiteName;
    }


    public String getWhiteName() {
        return whiteName;
    }

    public void setWhiteName(String whiteName) {
        this.whiteName = whiteName;
    }

    public String getBlackName() {
        return blackName;
    }

    public void setBlackName(String blackName) {
        this.blackName = blackName;
    }

    public ChessBoard getChessBoard() {
        return chessBoard;
    }

    public void setChessBoard(ChessBoard chessBoard) {
        this.chessBoard = chessBoard;
    }

    public String save() {
        careTakerStore.saveHistory(new Memento(chessBoard));
        careTakerStore.future.clear();
        return "Saved";
    }


    public void undo() {
        if (careTakerStore.isEmpty()) {
            return;
        }
        careTakerStore.saveFuture(new Memento(chessBoard));

        this.chessBoard = careTakerStore.getHistory().getChess();
    }

    public void redo() {
        if (careTakerStore.future.isEmpty()) return;
        careTakerStore.saveHistory(new Memento(chessBoard));
        this.chessBoard = careTakerStore.getFuture().getChess();
    }


}
