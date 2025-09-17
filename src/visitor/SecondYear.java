package visitor;

public class SecondYear implements Clearance {
    String sRollNo;
    int yearEndCharge;
    @Override
    public void clear(Department department) {
        department.check(this);
    }
}
