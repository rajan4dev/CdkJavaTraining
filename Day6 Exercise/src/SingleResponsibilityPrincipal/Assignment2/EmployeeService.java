package SingleResponsibilityPrincipal.Assignment2;

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

    public boolean eligibleForPromotion() {
        if (this.getExperience() > 1) {
            return true;
        }
        return false;
    }

}
