package commandPattern2;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

public class ACRemote {

    private final Map<Integer, ICommandAC> button = new HashMap<>();
    private final Deque<ICommandAC> undoStack = new ArrayDeque<>();
    private final Deque<ICommandAC> redoStack = new ArrayDeque<>();


    public ACRemote() {

    }

    public void setButton(int no, ICommandAC iCommandAC) {
        button.put(no, iCommandAC);
    }

    public void press(int i) {
        ICommandAC commandAC = button.get(i);
        if (commandAC == null) {
            return;
        }
        commandAC.execute();
        undoStack.push(commandAC);
        redoStack.clear();
    }

    public void undo() {
        ICommandAC iCommandAC = undoStack.pop();
        if (iCommandAC == null) {
            return;
        }
        iCommandAC.undo();
        redoStack.push(iCommandAC);
    }

    public void redo() {
        ICommandAC iCommandAC = redoStack.pop();
        if (iCommandAC == null) {
            return;
        }
        iCommandAC.execute();
        undoStack.push(iCommandAC);
    }
}
