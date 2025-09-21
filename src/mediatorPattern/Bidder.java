package mediatorPattern;

public class Bidder extends User {

    public Bidder(Mediator mediator, String name) {
        super(mediator, name);
        mediator.register(this);
    }

    @Override
    public void raiseBid(String message) {
        String mess = this.name + ": [ " + message + " ]";
        System.out.println(mess);
        mediator.sendMessage(mess, this);

    }

    @Override
    public void recieveBid(String message) {
        String mess = this.name + " recieved message:  " + message;
        System.out.println(mess);
    }
}
