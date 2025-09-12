package commandPattern;

public class CopyAction extends Action {


    public CopyAction(Notepad notepad) {
        super(notepad);
    }

    @Override
    public boolean execute() {
        notepad.clipBoard = notepad.textField.getSelectedText();
        return false;
    }
}
