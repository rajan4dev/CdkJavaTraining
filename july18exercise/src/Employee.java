import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by bhirudr on 7/18/2017.
 */

enum Location {
    Hyderabad, Pune;
}

public class Employee {


    public Employee(int empId, String name, Date dob, Date dateOfJoining, int deptId, Location location) {
        this.empId = empId;
        this.name = name;
        this.dob = dob;
        this.dateOfJoining = dateOfJoining;
        this.deptId = deptId;
        this.location = location;
    }

    int empId;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    String name;
    Date dob;
    Date dateOfJoining;
    int deptId;
    Location location;
    String lastName;

    public Employee(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public Date getDateOfJoining() {
        return dateOfJoining;
    }

    public void setDateOfJoining(Date dateOfJoining) {
        this.dateOfJoining = dateOfJoining;
    }

    public int getDeptId() {
        return deptId;
    }

    public void setDeptId(int deptId) {
        this.deptId = deptId;
    }

    //methods

    static Employee[] createSampleEmployeeData() {
        Employee e1 = new Employee(8, "Rajan", new Date(1996 - 1900, 1 - 1, 14), new Date(2017, 07, 07), 4, Location.Pune);
        Employee e2 = new Employee(7, "Raja", new Date(1997 - 1900, 1 - 1, 11), new Date(2017, 07, 07), 4, Location.Pune);
        Employee e3 = new Employee(3, "Raj", new Date(2002 - 1900, 11 - 1, 19), new Date(2017, 07, 07), 4, Location.Hyderabad);
        Employee e4 = new Employee(5, "Ra", new Date(2017 - 1900, 5 - 1, 13), new Date(2017, 07, 07), 4, Location.Pune);
        Employee e5 = new Employee(4, "R", new Date(2005 - 1900, 6 - 1, 17), new Date(2017, 07, 07), 4, Location.Hyderabad);

        ArrayList employeeList = new ArrayList();
        employeeList.add(e1);
        employeeList.add(e2);
        employeeList.add(e3);
        employeeList.add(e4);
        employeeList.add(e5);

        Employee[] empArray = {e1, e2, e3, e4, e5};
        return empArray;
    }

    static List<Employee> createTestEmployeeList() {
        Employee e1 = new Employee(8, "Rajan", new Date(1996 - 1900, 1 - 1, 14), new Date(2017, 07, 07), 4, Location.Pune);
        Employee e2 = new Employee(7, "Raja", new Date(1997 - 1900, 1 - 1, 11), new Date(2017, 07, 07), 7, Location.Pune);
        Employee e3 = new Employee(3, "Raj", new Date(2002 - 1900, 11 - 1, 19), new Date(2017, 07, 07), 9, Location.Hyderabad);
        Employee e4 = new Employee(5, "Ra", new Date(2017 - 1900, 5 - 1, 13), new Date(2017, 07, 07), 1, Location.Pune);
        Employee e5 = new Employee(4, "R", new Date(2005 - 1900, 6 - 1, 17), new Date(2017, 07, 07), 2, Location.Hyderabad);

        ArrayList employeeList = new ArrayList();
        employeeList.add(e1);
        employeeList.add(e2);
        employeeList.add(e3);
        employeeList.add(e4);
        employeeList.add(e5);
        return employeeList;
    }


    static List<Employee> createTestEmployeeListWith2params() {
        Employee e1 = new Employee("Rajan","Bhirud");
        Employee e2 = new Employee("Arshi","Saifi");
        Employee e3 = new Employee("Mahesh","Jagtap");
        ArrayList employeeList = new ArrayList();
        employeeList.add(e1);
        employeeList.add(e2);
        employeeList.add(e3);
        return employeeList;
    }



    DateFormat df = new SimpleDateFormat("yyyy-MM-dd");


    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", name='" + name + '\'' +
                ", dob=" + df.format(dob) +
                ", dateOfJoining=" + dateOfJoining +
                ", deptId=" + deptId +
                ", location=" + location +
                '}';
    }
}


