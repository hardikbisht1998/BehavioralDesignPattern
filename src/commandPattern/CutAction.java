package commandPattern;

public class CutAction extends Action {
    public CutAction(Notepad notepad) {
        super(notepad);
    }

    @Override
    public boolean execute() {
        if (notepad.textField.getSelectedText().isEmpty()) return false;
        setBackup();
        System.out.println("Sadmskjnsiukj");
        System.out.println();
        String source = notepad.textField.getText();
        notepad.clipBoard = notepad.textField.getSelectedText();
        notepad.textField.setText(cutString(source));
        return true;
    }

    private String cutString(String source) {
        String start = source.substring(0, notepad.textField.getSelectionStart());
        String last = source.substring(notepad.textField.getSelectionEnd());
        return start + last;
    }


}
