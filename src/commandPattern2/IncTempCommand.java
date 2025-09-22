package commandPattern2;

public class IncTempCommand implements ICommandAC {

    AC ac;

    public IncTempCommand(AC ac) {
        this.ac = ac;
    }

    @Override
    public void execute() {
        ac.incTemp();

    }

    public void undo() {
        ac.decTemp();
    }

}
