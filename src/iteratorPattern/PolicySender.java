package iteratorPattern;

import java.util.ArrayList;
import java.util.List;

public class PolicySender {

    private final List<Employee> employeeList = new ArrayList<>();

    public void addEmployee(Employee employee) { employeeList.add(employee); }

    public MyIterator<Employee> getSeniorEmployeeFirstIterator() {
        return new SeniorEmployeeFirstIterator(employeeList);
    }

    public MyIterator<Employee> getJuniorEmployeeFirstIterator() {
        return new JuniorEmployeeFirstIterator(employeeList);
    }

}
