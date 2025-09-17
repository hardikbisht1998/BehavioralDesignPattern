package chainOfResponsibility;

public abstract class LoanApproval {

    protected LoanApproval nextLoanApproval;

    public LoanApproval(LoanApproval loanApproval) {
        this.nextLoanApproval = loanApproval;
    }

    public LoanApproval getNextLoanApproval() {
        return nextLoanApproval;
    }

    public void setNextLoanApproval(LoanApproval nextLoanApproval) {
        this.nextLoanApproval = nextLoanApproval;
    }


    public abstract void approveLoan(Loan loan);
}
