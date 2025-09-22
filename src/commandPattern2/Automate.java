package commandPattern2;

import java.util.List;
import java.util.ListIterator;

public class Automate implements ICommandAC {
    private final List<ICommandAC> steps;

    public Automate(List<ICommandAC> steps) {
        this.steps = List.copyOf(steps);
    }

    public void execute() {
        steps.forEach(ICommandAC::execute);
    }

    public void undo() {                 // reverse order undo
        ListIterator<ICommandAC> it = steps.listIterator(steps.size());
        while (it.hasPrevious()) it.previous().undo();
    }
}
