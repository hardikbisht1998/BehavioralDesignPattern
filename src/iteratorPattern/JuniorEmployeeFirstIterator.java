package iteratorPattern;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class JuniorEmployeeFirstIterator implements MyIterator{

    List<Employee> employeeList;
    int index=0;
    int length;

    public JuniorEmployeeFirstIterator(List<Employee> employeeList) {
    this.employeeList=employeeList;
    length=employeeList.size();
    Collections.sort(employeeList, (a, b) -> a.getDateOfJoining().compareTo(b.getDateOfJoining()));

    }

    @Override
    public boolean hasNext() {
          if(index>=length) return false;
          return true;
    }

    @Override
    public Employee getNext() {
        return employeeList.get(index++);

    }

    @Override
    public void reset() {
        index=0;

    }
}
