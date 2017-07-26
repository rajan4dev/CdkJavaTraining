package SingleResponsibilityPrincipal.Assignment2;

import assignment3.Employee;
import org.junit.Test;

import java.util.ArrayList;

/**
 * Created by bhirudr on 7/25/2017.
 */
public class TestCompanyServices {

    @Test
    public void testEmployeeService() {
        EmployeeService.getEmployeeServices();
    }

    @Test
    public void testFinanceService() {
        ArrayList<EmployeeService> employeeServices = EmployeeService.getEmployeeServices();
        for (EmployeeService employee : employeeServices) {
            System.out.println("employeeID: " + employee.getEmpId() + " Salary: " + employee.getSalary() + " TDS: " + FinanceService.calculateTDS(employee));
        }

    }

    @Test
    public void testHRService() {
        ArrayList<EmployeeService> employeeServices = EmployeeService.getEmployeeServices();
        for (EmployeeService employeeService : employeeServices) {
            boolean eligibleForPromotion = HRService.eligibleForPromotion(employeeService);
            System.out.println("EmployeeId: " + employeeService.getEmpId() + " Experience: " + employeeService.getExperience() + " EligibleForPromotion :" + eligibleForPromotion);
        }
        System.out.println("=====================================================");
        HRService.changeProject(employeeServices.get(3));
        HRService.changeProject(employeeServices.get(9));

        System.out.println("=====================================================");
        HRService.changeDesignation(employeeServices.get(3), "Sr Java Developer");
        HRService.changeDesignation(employeeServices.get(4), "Sr Java Developer");

        System.out.println("=====================================================");
        HRService.updateSalary(employeeServices.get(1), 2000000.00);
        HRService.updateSalary(employeeServices.get(3), 50.00);
        HRService.updateSalary(employeeServices.get(6), 400.00);
    }


}
