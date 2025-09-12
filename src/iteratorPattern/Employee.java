package iteratorPattern;

import java.util.Date;

public class Employee {
    public int employeeId;
    public String name;
    public Date dateOfJoining;
    public int jobLevel;
    public int salary;

    public String getName() {
        return name;
    }

    public int getJobLevel() {
        return jobLevel;
    }

    public Date getDateOfJoining() {
        return dateOfJoining;
    }

    public int getSalary() {
        return salary;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public Employee(int employeeId, String name, Date dateOfJoining, int jobLevel, int salary) {
        this.employeeId = employeeId;
        this.name = name;
        this.dateOfJoining = dateOfJoining;
        this.jobLevel = jobLevel;
        this.salary = salary;
    }

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
