package iteratorPattern;

import java.util.Calendar;
import java.util.Date;

public class IteratorTester {

    public void check(){
        Employee employee=new Employee(123,"hardik",new Date(2022, Calendar.JULY,11),3,29000);
        Employee employee1=new Employee(123,"shayam",new Date(2023, Calendar.SEPTEMBER,3),5,60000);
        Employee employee2=new Employee(123,"Param",new Date(2025, Calendar.AUGUST,20),6,94000);
        PolicySender policySender=new PolicySender();
        policySender.addEmployee(employee);
        policySender.addEmployee(employee1);
        policySender.addEmployee(employee2);

        MyIterator myIterator=policySender.getJuniorEmployeeFirstIterator();
        if(myIterator.hasNext()){
            System.out.println(myIterator.getNext());
        }

        MyIterator myIterator2=policySender.getSeniorEmployeeFirstIterator();
        if(myIterator2.hasNext()){
            System.out.println(myIterator2.getNext());
        }


    }
}
