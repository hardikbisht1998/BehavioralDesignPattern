package visitor;

public class LibraryDepartment implements Department{
    @Override
    public void check(FirstYear firstYear) {
        // 1 year has so many books to rent from library
        firstYear.yearEndCharge+=8000;
    }

    @Override
    public void check(SecondYear secondYear) {
        // 2 year has  many books to rent from library
        secondYear.yearEndCharge+=6000;
    }

    @Override
    public void check(ThirdYear thirdYear) {
// 3 year has so many specialised books to rent from library
        thirdYear.yearEndCharge+=8000;
    }

    @Override
    public void check(FourthYear fourthYear) {
// 4 year has  not much books to rent from library
        fourthYear.yearEndCharge+=800;
    }
}
