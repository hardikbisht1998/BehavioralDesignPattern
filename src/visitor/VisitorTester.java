package visitor;

import java.util.ArrayList;
import java.util.List;

public class VisitorTester {


    public void check() {
        List<Clearance> studentListClearance = new ArrayList<>();

        FirstYear hardik = new FirstYear();
        hardik.sRollNo = "10002";

        SecondYear bisht = new SecondYear();
        bisht.sRollNo = "10003";

        studentListClearance.add(hardik);
        studentListClearance.add(bisht);

        List<Department> departmentList = new ArrayList<>();
        departmentList.add(new HostelDepartment());
        departmentList.add(new TravelDepartment());
        departmentList.add(new LibraryDepartment());

        for (Clearance student : studentListClearance) {
            for (Department department : departmentList) {
                student.clear(department);
            }
        }

        System.out.println("Hardik charges "+ hardik.yearEndCharge);
        System.out.println("Bisht charges "+ bisht.yearEndCharge);


    }
}
