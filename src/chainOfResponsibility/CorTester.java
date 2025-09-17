package chainOfResponsibility;

public class CorTester {
    public void check() {
        BranchManager branchManager = new BranchManager("Hardik", new Director("Bisht", new VicePresident("Shayan", null)));
//        Director director=new Director("Param");
//        VicePresident vicePresident=new VicePresident("Shayan");
//        branchManager.setNextLoanApproval(director);
//        director.nextLoanApproval=vicePresident;

        Loan loan = new Loan(240000, "google");

        branchManager.approveLoan(loan);
    }
}
