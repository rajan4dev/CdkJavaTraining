package StringPractice.EmployeePackage;

/**
 * Created by bhirudr on 7/22/2017.
 */
//enum Location{
//    Pune, Hyderabad
//}
//enum DeptName {
//    HR,Finance,RnD,Admin
//}
public class Employee {
    private String fName;
    private String lName;
    private int employeeId;
    private String deptName;
    private String location;

    public Employee(String fName, String lName, int employeeId, String deptName, String location) {
        this.fName = fName;
        this.lName = lName;
        this.employeeId = employeeId;
        this.deptName = deptName;
        this.location = location;
    }

    @Override
    public String toString() {
        return "Employee{" +
                 fName + ", " +  lName + ", " +
                 employeeId + ", " +
                deptName + ", " +
                 location +
                '}';
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }


}
