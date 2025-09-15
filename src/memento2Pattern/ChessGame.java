package memento2Pattern;


public class ChessGame {

    private ChessBoard chessBoard;
    private final String blackName;
    private final String whiteName;
    private final CareTakerStore careTakerStore = new CareTakerStore();

    public ChessGame(String blackName, String whiteName) {
        this.chessBoard = new ChessBoard();
        this.blackName = blackName;
        this.whiteName = whiteName;
    }

    public void save() {
        careTakerStore.saveHistory(chessBoard.createMemento());
        careTakerStore.clearFuture();
    }

    public void undo() {
        if (careTakerStore.isHistoryEmpty()) return;
        careTakerStore.saveFuture(chessBoard.createMemento());
        ChessBoard.Memento previous = careTakerStore.getHistory();
        chessBoard.restore(previous);
    }

    public void redo() {
        if (careTakerStore.isFutureEmpty()) return;
        careTakerStore.saveHistory(chessBoard.createMemento());
        ChessBoard.Memento next = careTakerStore.getFuture();
        chessBoard.restore(next);
    }

    public ChessBoard getChessBoard() {
        return chessBoard;
    }
}
