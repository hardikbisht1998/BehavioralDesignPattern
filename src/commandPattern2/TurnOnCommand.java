package commandPattern2;

public class TurnOnCommand implements ICommandAC {
    AC ac;

    public TurnOnCommand(AC ac) {
        this.ac = ac;
    }

    @Override
    public void execute() {
        ac.turnOn();
    }

    public void undo() {
        ac.turnOff();
    }

}
