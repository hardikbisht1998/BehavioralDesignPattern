package visitor;

public class TravelDepartment implements Department{
    @Override
    public void check(FirstYear firstYear) {
        //
        firstYear.yearEndCharge+=5000;
    }

    @Override
    public void check(SecondYear secondYear) {
//        1 industrial visit in course
         secondYear.yearEndCharge+=7000;
    }

    @Override
    public void check(ThirdYear thirdYear) {
//     2 industrial visit in course
        thirdYear.yearEndCharge+=9000;
    }

    @Override
    public void check(FourthYear fourthYear) {
  // not much
        fourthYear.yearEndCharge+=800;
    }
}
