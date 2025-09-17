package chainOfResponsibility;

public class BranchManager extends LoanApproval {
    private String branchManager;

    public BranchManager(String branchManager, LoanApproval loanApproval) {
        super(loanApproval);
        this.branchManager = branchManager;

    }

    @Override
    public void approveLoan(Loan loan) {
        if (loan.getLoanAmount() < 250000) {
            loan.setSanctionedBy(branchManager);
            System.out.println("Loan amount of " + loan.getLoanAmount() + " of debtor " + loan.getDebtorNamer() + " is sanction by BM " + branchManager);
        } else {
            nextLoanApproval.approveLoan(loan);
        }
    }
}
