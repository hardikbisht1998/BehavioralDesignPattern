package statePattern;

public abstract class State {
    AadharUser aadharUser;

    public State(AadharUser aadharUser) {
        this.aadharUser = aadharUser;
    }

    public String getLink(String generateLinkForThatId) {
        //payment gateway link
        return "http://linktoGateway";
    }

    public abstract void accept(String mesage);

    public abstract void reject(String mesage);


}
