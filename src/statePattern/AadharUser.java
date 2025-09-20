package statePattern;

public class AadharUser {
    private int applicationNo;
    private State state;
    private String Document;
    private String message;
    private boolean moneyPaid;
    private int amount;
    private boolean addressChangeApproved;

    public AadharUser(int applicationNo) {
        this.applicationNo = applicationNo;
        this.state = new DraftState(this);
        this.moneyPaid = false;
        this.addressChangeApproved = false;
    }

    public int getApplicationNo() {
        return applicationNo;
    }

    public void setApplicationNo(int applicationNo) {
        this.applicationNo = applicationNo;
    }

    public void changeState(State newState) {
        state = newState;
        System.out.println("State changed to: " + newState.getClass().getSimpleName());
    }

    public State getState() {
        return state;
    }

    public String getDocument() {
        return Document;
    }

    public void setDocument(String document) {
        Document = document;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isMoneyPaid() {
        return moneyPaid;
    }

    public void setMoneyPaid(boolean moneyPaid) {
        this.moneyPaid = moneyPaid;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public boolean isAddressChangeApproved() {
        return addressChangeApproved;
    }

    public void setAddressChangeApproved(boolean addressChangeApproved) {
        this.addressChangeApproved = addressChangeApproved;
    }
}
