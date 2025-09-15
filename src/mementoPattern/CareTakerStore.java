package mementoPattern;

import java.util.Stack;

public class CareTakerStore {
    Stack<Memento> history = new Stack<>();
    Stack<Memento> future = new Stack<>();

    public void saveHistory(Memento memento) {
        history.push(memento);
    }

    public Memento getHistory() {
        return history.isEmpty() ? null : history.pop();
    }


    public Memento getFuture() {
        return future.pop();
    }

    public void saveFuture(Memento memento) {
        future.push(memento);
    }


    boolean isEmpty() {
        return history.isEmpty();
    }
}
