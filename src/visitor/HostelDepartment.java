package visitor;

public class HostelDepartment implements Department{
    @Override
    public void check(FirstYear firstYear) {
//        all got 1bhk as they are fresher take time to associate with people
        firstYear.yearEndCharge+=20000;
    }

    @Override
    public void check(SecondYear secondYear) {
//       shifted to villa with 10 people according to groups
     secondYear.yearEndCharge+=10000;
    }

    @Override
    public void check(ThirdYear thirdYear) {
        //       shifted to villa with 5 people according to groups
        thirdYear.yearEndCharge+=6000;
    }

    @Override
    public void check(FourthYear fourthYear) {
       //call to database according to roolno. and check if hostel is enabled or not ,1,2,3 hostel com,pulsory
        boolean busEnabled=true;
        if(busEnabled){
            fourthYear.yearEndCharge+=6000;
        }else{

        }
    }
}
