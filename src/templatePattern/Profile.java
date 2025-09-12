package templatePattern;

import java.util.ArrayList;
import java.util.List;

public class Profile {
    private String name;
    private int workExp;
    private int lastCompanies;
    private List<String> lastCompanyNames = new ArrayList<>();
    private String[] skills = new String[50];
    private int expectedSalary;
    private int lastSalary;
    private String emailId;
    private long phoneNo;


    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getWorkExp() { return workExp; }
    public void setWorkExp(int workExp) { this.workExp = workExp; }

    public int getLastCompanies() { return lastCompanies; }
    public void setLastCompanies(int lastCompanies) { this.lastCompanies = lastCompanies; }

    public List<String> getLastCompanyNames() { return lastCompanyNames; }
    public void setLastCompanyNames(List<String> lastCompanyNames) { this.lastCompanyNames = lastCompanyNames; }

    public String[] getSkills() { return skills; }
    public void setSkills(String[] skills) { this.skills = skills; }

    public int getExpectedSalary() { return expectedSalary; }
    public void setExpectedSalary(int expectedSalary) { this.expectedSalary = expectedSalary; }

    public int getLastSalary() { return lastSalary; }
    public void setLastSalary(int lastSalary) { this.lastSalary = lastSalary; }

    public String getEmailId() { return emailId; }
    public void setEmailId(String emailId) { this.emailId = emailId; }

    public long getPhoneNo() { return phoneNo; }
    public void setPhoneNo(long phoneNo) { this.phoneNo = phoneNo; }
}
