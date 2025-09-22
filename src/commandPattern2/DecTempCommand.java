package commandPattern2;

public class DecTempCommand implements ICommandAC {

    AC ac;

    public DecTempCommand(AC ac) {
        this.ac = ac;
    }

    @Override
    public void execute() {
        ac.decTemp();
    }

    public void undo() {
        ac.incTemp();
    }

}
