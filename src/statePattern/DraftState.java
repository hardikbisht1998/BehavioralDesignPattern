package statePattern;

public class DraftState extends State {

    public DraftState(AadharUser aadharUser) {
        super(aadharUser);
    }

    public void submitApplication(String document) {
        aadharUser.setDocument(document);
        accept("Application submitted with document: " + document);
    }

    @Override
    public void accept(String message) {
        System.out.println("Draft submitted. Moving to Payment Stage.");
        aadharUser.changeState(new PaymentState(aadharUser));
    }


    @Override
    public void reject(String message) {
        //do nothing
        System.out.println("Cannot reject in draft stage");
    }


}
