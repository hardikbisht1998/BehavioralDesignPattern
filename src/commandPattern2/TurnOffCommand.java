package commandPattern2;

public class TurnOffCommand implements ICommandAC {

    AC ac;

    public TurnOffCommand(AC ac) {
        this.ac = ac;
    }

    @Override
    public void execute() {
        ac.turnOff();
    }

    public void undo() {
        ac.turnOn();
    }


}
