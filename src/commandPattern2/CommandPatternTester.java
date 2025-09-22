package commandPattern2;

import java.util.List;

public class CommandPatternTester {

    public void check() {
        AC ac = new AC();
        ACRemote remote = new ACRemote();


        remote.setButton(1, new TurnOnCommand(ac));

        remote.setButton(2, new IncSpeedCommand(ac));


        ICommandAC turbo = new Automate(List.of(
                new TurnOnCommand(ac),
                new IncSpeedCommand(ac),
                new IncSpeedCommand(ac),
                new TurboModeCommand(ac))
        );
        remote.setButton(3, turbo);


        remote.press(1);
        remote.press(2);
        remote.press(3);
        remote.undo();
        remote.undo();
        remote.redo();

    }
}
