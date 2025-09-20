package statePattern;

public class VerificationState extends State {
    public VerificationState(AadharUser aadharUser) {
        super(aadharUser);
    }

    @Override
    public void accept(String messageFromVerifier) {
        System.out.println("Document verified successfully. Moving to Validation Stage.");
        aadharUser.setMessage(messageFromVerifier);
        aadharUser.changeState(new ValidationState(aadharUser));

    }

    @Override
    public void reject(String message) {

        System.out.println("Document verification failed: " + message);
        aadharUser.setMessage("Verification failed: " + message);

        aadharUser.changeState(new DraftState(aadharUser));
    }


}
