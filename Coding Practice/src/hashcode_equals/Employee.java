package hashcode_equals;

import java.util.HashMap;

/**
 * Created by bhirudr on 10/30/2017.
 */
public class Employee {
    private String empID;
    private String name;

    public String getEmpID() {
        return empID;
    }

    public void setEmpID(String empID) {
        this.empID = empID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employee(String empID, String name) {

        this.empID = empID;
        this.name = name;
    }

    @Override
    public int hashCode() {
        return (this.empID+this.name).hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        Employee employee= (Employee) obj;
        if(employee!=null && employee.empID.equals(this.empID) && employee.name.equals(this.name))
            return true;
        return false;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empID='" + empID + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
