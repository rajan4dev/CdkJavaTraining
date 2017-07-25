package assignment3;

/**
 * Created by bhirudr on 7/25/2017.
 */
public class Employee {
    int empId;
    String name;
    double salary;

    public double calculateHRA() {
        return 0.3 * this.salary;

    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Employee(int empId, String name, double salary) {

        this.empId = empId;
        this.name = name;
        this.salary = salary;
    }


}
