package day61;

public class Job implements Comparable<Job> {
   private String location;
   private Double salary;
   private String CompanyName;

    public Job(String location, Double salary, String companyName) {
        this.location = location;
        this.salary = salary;
        CompanyName = companyName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getCompanyName() {
        return CompanyName;
    }

    public void setCompanyName(String companyName) {
        CompanyName = companyName;
    }

    @Override
    public String toString() {
        return "Job{" +
                "location='" + location + '\'' +
                ", salary=" + salary +
                ", CompanyName='" + CompanyName + '\'' +
                '}';
    }

    @Override
    public int compareTo(Job o) {


        return this.salary.compareTo(o.salary);
    }
}
