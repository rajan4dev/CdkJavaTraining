package SingleResponsibilityPrincipal.Assignment2;

/**
 * Created by bhirudr on 7/25/2017.
 */
public class HRService {

    static void updateSalary(EmployeeService employeeService, Double salary) {

        employeeService.salary = salary;
    }

    static void changeProject(EmployeeService employeeService) {
        if (employeeService.getExperience() > 1) {
            System.out.println("Project Changed for EmployeeID " + employeeService.empId);
        } else
            System.out.println("Not eligible to change project");
    }

    static void changeDesignation(EmployeeService employeeService, String desig) {
        if (employeeService.eligibleForPromotion())
            employeeService.desig = desig;
        System.out.println("Designation changed to " + desig + " for employeeID " + employeeService.getEmpId());
    }
}
