package iteratorPattern;

import java.util.ArrayList;
import java.util.List;

public class PolicySender {

    List<Employee> employeeList=new ArrayList<>();

    public void addEmployee(Employee employee){
        employeeList.add(employee);
    }

    public Employee getEmployee(int index){
        return employeeList.get(index);
    }

    public MyIterator getSeniorEmployeeFirstIterator(){
        return new SeniorEmployeeFirstIterator(employeeList);
    }

    public MyIterator getJuniorEmployeeFirstIterator(){
        return new JuniorEmployeeFirstIterator(employeeList);
    }

}
