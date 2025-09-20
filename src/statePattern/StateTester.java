package statePattern;

public class StateTester {

    public void check() {
        System.out.println("=== Aadhaar Address Change Application ===");

        AadharUser user = new AadharUser(1222);

        // Stage 1: Draft - Submit application
        DraftState draft = (DraftState) user.getState();
        draft.submitApplication("Electricity Bill as Address Proof");

        // Stage 2: Payment
        PaymentState payment = (PaymentState) user.getState();
        payment.notifFromPayment("Payment ID: PAY123456, Amount: 50");

        // Stage 3: Verification
        user.getState().accept("Document verified - Electricity bill is valid address proof");

        // Stage 4: Validation
        user.getState().accept("Address validation completed - Change approved");

        // Stage 5: Completed
        user.getState().accept("Process completed successfully");

        System.out.println("\nFinal Status: " + user.getMessage());
    }
}
