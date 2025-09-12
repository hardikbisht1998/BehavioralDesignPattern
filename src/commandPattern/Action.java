package commandPattern;

public abstract class Action {

    public Notepad notepad;
    public String backup;

    public Action(Notepad notepad) {
        this.notepad = notepad;
    }


    void setBackup() {
        backup = notepad.textField.getText();
    }

    public void undo() {
        notepad.textField.setText(backup);
    }

    public abstract boolean execute();


}
