package SingleResponsibilityPrincipal.Assignment2;

import java.util.ArrayList;

/**
 * Created by bhirudr on 7/25/2017.
 */
public class EmployeeService {
    int empId;
    String name;
    double salary;
    String phone;
    String desig;
    int experience;

    @Override
    public String toString() {
        return "EmployeeService{" +
                "empId=" + empId +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", phone='" + phone + '\'' +
                ", desig='" + desig + '\'' +
                ", experience=" + experience +
                '}';
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDesig() {
        return desig;
    }

    public void setDesig(String desig) {
        this.desig = desig;
    }


    public EmployeeService(int empId, double salary, String desig, int experience) {
        this.empId = empId;
        this.salary = salary;
        this.desig = desig;
        this.experience = experience;
    }

    public static ArrayList<EmployeeService> getEmployeeServices() {
        EmployeeService e1 = new EmployeeService(1, 2000,"Member Technical",2);
        EmployeeService e2 = new EmployeeService(2, 20000,"Member Technical",5);
        EmployeeService e3 = new EmployeeService(3, 40000,"Member Technical",1);
        EmployeeService e4 = new EmployeeService(4, 70000,"Sr Member Technical",1);
        EmployeeService e5 = new EmployeeService(5, 750000,"Member Technical",2);
        EmployeeService e6 = new EmployeeService(6,230,"Member Technical",2);
        EmployeeService e7 = new EmployeeService(7, 4000,"Member Technical",3);
        EmployeeService e8 = new EmployeeService(8, 200,"Member Technical",3);
        EmployeeService e9 = new EmployeeService(9, 2430,"Member Technical",7);
        EmployeeService e10 = new EmployeeService(10, 23400,"Sr Member Technical",7);

        ArrayList<EmployeeService> employeeArrayList = new ArrayList<>();
        employeeArrayList.add(e1);
        employeeArrayList.add(e2);
        employeeArrayList.add(e3);
        employeeArrayList.add(e4);
        employeeArrayList.add(e5);
        employeeArrayList.add(e6);
        employeeArrayList.add(e7);
        employeeArrayList.add(e8);
        employeeArrayList.add(e9);
        employeeArrayList.add(e10);
        return employeeArrayList;
    }
}
