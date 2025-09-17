package chainOfResponsibility;


public class VicePresident extends LoanApproval {
    private String bankVicePresident;

    public VicePresident(String bankVicePresident, LoanApproval loanApproval) {
        super(loanApproval);
        this.bankVicePresident = bankVicePresident;
    }

    @Override
    public void approveLoan(Loan loan) {
        if (loan.getLoanAmount() < 250000000) {
            loan.setSanctionedBy(bankVicePresident);
            System.out.println("Loan amount of " + loan.getLoanAmount() + " of debtor " + loan.getDebtorNamer() + " is sanction by  VP" + bankVicePresident);
        } else {
            System.out.println("Amount is too big to sanction have to apply through special route");
        }
    }
}
