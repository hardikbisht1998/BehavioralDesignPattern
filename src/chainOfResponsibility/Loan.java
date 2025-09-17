package chainOfResponsibility;

public class Loan {

    private long loanAmount;
    private long downPayment;
    private long monthlyEmi;
    private String guranteer;
    private String collateral;
    private String debtorNamer;
    private String sanctionedBy;

    public Loan(long loanAmount, String debtorNamer) {
        this.loanAmount = loanAmount;
        this.debtorNamer = debtorNamer;
    }

    public long getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(long loanAmount) {
        this.loanAmount = loanAmount;
    }

    public long getDownPayment() {
        return downPayment;
    }

    public void setDownPayment(long downPayment) {
        this.downPayment = downPayment;
    }

    public long getMonthlyEmi() {
        return monthlyEmi;
    }

    public void setMonthlyEmi(long monthlyEmi) {
        this.monthlyEmi = monthlyEmi;
    }

    public String getGuranteer() {
        return guranteer;
    }

    public void setGuranteer(String guranteer) {
        this.guranteer = guranteer;
    }

    public String getCollateral() {
        return collateral;
    }

    public void setCollateral(String collateral) {
        this.collateral = collateral;
    }

    public String getDebtorNamer() {
        return debtorNamer;
    }

    public void setDebtorNamer(String debtorNamer) {
        this.debtorNamer = debtorNamer;
    }

    public String getSanctionedBy() {
        return sanctionedBy;
    }

    public void setSanctionedBy(String sanctionedBy) {
        this.sanctionedBy = sanctionedBy;
    }
}
