package iteratorPattern;


import java.time.LocalDate;
import java.util.Objects;

public final class Employee {
    private final int employeeId;
    private final String name;
    private final LocalDate dateOfJoining;
    private final int jobLevel;
    private final int salary; // consider long for bigger ranges

    public Employee(int employeeId, String name, LocalDate dateOfJoining, int jobLevel, int salary) {
        this.employeeId = employeeId;
        this.name = Objects.requireNonNull(name);
        this.dateOfJoining = Objects.requireNonNull(dateOfJoining);
        this.jobLevel = jobLevel;
        this.salary = salary;
    }

    public int getEmployeeId() { return employeeId; }
    public String getName() { return name; }
    public LocalDate getDateOfJoining() { return dateOfJoining; }
    public int getJobLevel() { return jobLevel; }
    public int getSalary() { return salary; }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", name='" + name + '\'' +
                ", dateOfJoining=" + dateOfJoining +
                ", jobLevel=" + jobLevel +
                ", salary=" + salary +
                '}';
    }
}
