package statePattern;

public class PaymentState extends State implements PayStatus {
    public PaymentState(AadharUser aadharUser) {
        super(aadharUser);
    }


    @Override
    public void accept(String messageFromPayment) {

        if (aadharUser.isMoneyPaid()) {
            System.out.println("Payment verified. Moving to Verification Stage.");
            aadharUser.changeState(new VerificationState(aadharUser));
        } else {
            System.out.println("Payment pending. Cannot proceed.");
        }
    }

    @Override
    public void reject(String changeStateMessageByScheduler) {
        System.out.println("Payment failed or expired. Returning to Draft.");
        aadharUser.setMessage("Payment failed: " + changeStateMessageByScheduler);
        aadharUser.changeState(new DraftState(aadharUser));
    }

    @Override
    public void notifFromPayment(String messageFromPayment) {
        aadharUser.setMoneyPaid(true);
        aadharUser.setAmount(50); // Standard fee for address change
        System.out.println("Payment of ₹50 received successfully");
        accept("Payment completed");
    }


}
