package commandPattern2;

public interface ICommandAC {

    public void execute();

    default void undo() {
    }
}
