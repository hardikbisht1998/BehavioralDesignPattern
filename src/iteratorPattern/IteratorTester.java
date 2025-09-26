package iteratorPattern;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class IteratorTester {

    public void check(){
        Employee e1 = new Employee(101, "Hardik",  LocalDate.of(2022, 7, 11), 3, 29000);
        Employee e2 = new Employee(102, "Shyam",   LocalDate.of(2023, 9,  3), 5, 60000);
        Employee e3 = new Employee(103, "Param",   LocalDate.of(2025, 8, 20), 6, 94000);

        PolicySender policySender = new PolicySender();
        policySender.addEmployee(e1);
        policySender.addEmployee(e2);
        policySender.addEmployee(e3);

        System.out.println("--- Junior first (most recent joiners first) ---");
        MyIterator<Employee> itJ = policySender.getJuniorEmployeeFirstIterator();
        while (itJ.hasNext()) {
            System.out.println(itJ.getNext());
        }

        System.out.println("--- Senior first (oldest joiners first) ---");
        MyIterator<Employee> itS = policySender.getSeniorEmployeeFirstIterator();
        while (itS.hasNext()) {
            System.out.println(itS.getNext());
        }


    }
}
