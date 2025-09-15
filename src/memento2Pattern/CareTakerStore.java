package memento2Pattern;


import java.util.Stack;

public class CareTakerStore {
    private final Stack<ChessBoard.Memento> history = new Stack<>();
    private final Stack<ChessBoard.Memento> future = new Stack<>();

    public void saveHistory(ChessBoard.Memento memento) {
        history.push(memento);
    }

    public ChessBoard.Memento getHistory() {
        return history.isEmpty() ? null : history.pop();
    }

    public void saveFuture(ChessBoard.Memento memento) {
        future.push(memento);
    }

    public ChessBoard.Memento getFuture() {
        return future.isEmpty() ? null : future.pop();
    }

    public void clearFuture() {
        future.clear();
    }

    public boolean isHistoryEmpty() {
        return history.isEmpty();
    }

    public boolean isFutureEmpty() {
        return future.isEmpty();
    }
}

