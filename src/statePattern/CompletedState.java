package statePattern;

public class CompletedState extends State {
    public CompletedState(AadharUser aadharUser) {
        super(aadharUser);
    }

    @Override
    public void accept(String changeMessage) {

        if (aadharUser.isAddressChangeApproved()) {
            System.out.println("Address change completed successfully!");
            System.out.println("New Aadhaar will be delivered in 10 working days");
            aadharUser.setMessage("Address change completed. New Aadhaar will be sent.");
        }
    }

    @Override
    public void reject(String message) {
        // Can only reject if there's an issue found later
        System.out.println("Issue found in completed application: " + message);
        aadharUser.setMessage(message);
        aadharUser.changeState(new DraftState(aadharUser));
    }
}
