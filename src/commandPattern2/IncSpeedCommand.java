package commandPattern2;

public class IncSpeedCommand implements ICommandAC {
    AC ac;

    public IncSpeedCommand(AC ac) {
        this.ac = ac;
    }

    @Override
    public void execute() {
        ac.incSpeed();
    }

    public void undo() {
        ac.decSpeed();
    }
}
