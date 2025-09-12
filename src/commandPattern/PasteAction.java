package commandPattern;

public class PasteAction extends Action {
    public PasteAction(Notepad notepad) {
        super(notepad);
    }

    @Override
    public boolean execute() {
        if (notepad.clipBoard == null || notepad.clipBoard.isEmpty()) {
            return false;
        }
        setBackup();
        notepad.textField.insert(notepad.clipBoard, notepad.textField.getCaretPosition());
        return true;

    }
}
