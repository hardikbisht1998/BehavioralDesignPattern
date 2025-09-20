package statePattern;

public class ValidationState extends State {
    public ValidationState(AadharUser aadharUser) {
        super(aadharUser);
    }

    @Override
    public void accept(String messageFromValidator) {

        System.out.println("Validation successful. Address change approved!");
        aadharUser.setMessage(messageFromValidator);
        aadharUser.setAddressChangeApproved(true);

        aadharUser.changeState(new CompletedState(aadharUser));
    }

    @Override
    public void reject(String message) {
        System.out.println("Validation failed: " + message);
        aadharUser.setMessage("Validation failed: " + message);
        aadharUser.changeState(new DraftState(aadharUser));
    }


}
