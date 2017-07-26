package SingleResponsibilityPrincipal.Assignment2;

/**
 * Created by bhirudr on 7/25/2017.
 */
public class HRService {

    static void updateSalary(EmployeeService employeeService, Double salary) {
        System.out.println("EmpID: " + employeeService.getEmpId() + " old salary: " + employeeService.getSalary());
        employeeService.salary = salary;
        System.out.println("EmpID: " + employeeService.getEmpId() + " updated salary: " + employeeService.getSalary());
    }

    static void changeProject(EmployeeService employeeService) {
        if (employeeService.getExperience() > 1)
            System.out.println("Project Changed for EmployeeID " + employeeService.empId);
        else
            System.out.println("EmpID: " + employeeService.getEmpId() + " Not eligible to change project");
    }

    static void changeDesignation(EmployeeService employeeService, String desig) {
        if (eligibleForPromotion(employeeService)) {
            employeeService.desig = desig;
            System.out.println("Designation changed to " + desig + " for employeeID " + employeeService.getEmpId());
        } else
            System.out.println("EmpID: " + employeeService.getEmpId() + " Not Eligible to change Designation ");
    }

    public static boolean eligibleForPromotion(EmployeeService employeeService) {
        if (employeeService.getExperience() > 1) {
            return true;
        }
        return false;
    }
}
