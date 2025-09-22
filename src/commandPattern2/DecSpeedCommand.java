package commandPattern2;

public class DecSpeedCommand implements ICommandAC {

    AC ac;

    public DecSpeedCommand(AC ac) {
        this.ac = ac;
    }

    @Override
    public void execute() {
        ac.decSpeed();
    }

    public void undo() {
        ac.incSpeed();

    }
}
