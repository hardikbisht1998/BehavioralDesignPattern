package visitor;

public class FourthYear implements Clearance{
    String sRollNo;
    int yearEndCharge;
    @Override
    public void clear(Department department) {
        department.check(this);
    }
}
