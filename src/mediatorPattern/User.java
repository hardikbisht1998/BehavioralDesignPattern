package mediatorPattern;

public abstract class User {
    String name;
    Mediator mediator;

    public User(Mediator mediator, String name) {
        this.name = name;
        this.mediator = mediator;

    }

    public abstract void raiseBid(String message);

    public abstract void recieveBid(String message);
}
