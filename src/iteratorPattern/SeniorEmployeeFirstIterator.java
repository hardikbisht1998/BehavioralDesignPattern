package iteratorPattern;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SeniorEmployeeFirstIterator implements MyIterator<Employee> {

    private final List<Employee> data; // snapshot, already sorted ASC by joining date
    private int index = 0;

    public SeniorEmployeeFirstIterator(Collection<Employee> source) {
        this.data = source.stream()
                .sorted(Comparator.comparing(Employee::getDateOfJoining))
                .collect(Collectors.toList());
    }

    @Override
    public boolean hasNext() {
        return index < data.size();
    }

    @Override
    public Employee getNext() {
        return data.get(index++);
    }

    @Override
    public void reset() {
        index = 0;
    }
}
