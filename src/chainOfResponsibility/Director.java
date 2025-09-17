package chainOfResponsibility;

public class Director extends LoanApproval {
    private String bankDirectort;

    public Director(String bankDirectort, LoanApproval loanApproval) {
        super(loanApproval);
        this.bankDirectort = bankDirectort;
    }

    @Override
    public void approveLoan(Loan loan) {
        if (loan.getLoanAmount() < 2500000) {
            loan.setSanctionedBy(bankDirectort);
            System.out.println("Loan amount of " + loan.getLoanAmount() + "of debtor " + loan.getDebtorNamer() + " is sanction by Director " + bankDirectort);
        } else {
            nextLoanApproval.approveLoan(loan);
        }
    }
}
