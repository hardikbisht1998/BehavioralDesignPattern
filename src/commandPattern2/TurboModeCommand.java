package commandPattern2;

public class TurboModeCommand implements ICommandAC {
    AC ac;
    private int oldTemp;
    private int oldSpeed;


    public TurboModeCommand(AC ac) {
        this.ac = ac;
    }

    @Override
    public void execute() {
        oldTemp = ac.getTemp();
        oldSpeed = ac.getFanSpeed();
        ac.setTemp(23);
        ac.setFanSpeed(8);
    }

    public void undo() {
        ac.setTemp(oldTemp);
        ac.setFanSpeed(oldSpeed);
    }


}
