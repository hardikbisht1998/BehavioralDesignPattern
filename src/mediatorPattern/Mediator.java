package mediatorPattern;

public interface Mediator {
    public void sendMessage(String message, User user);

    public void register(User user);

}
