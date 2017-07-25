package SingleResponsibilityPrincipal.Assignment2;

public class FinanceService {
    public static double calculateTDS(EmployeeService employeeService) {
        double tds;
        double salary = employeeService.getSalary();
        if (salary > 200000 && salary < 500000) {
            tds = 0.1 * salary;
            return tds;
        } else if (salary > 500000 && salary < 1000000) {
            tds = 0.2 * salary;
            return tds;
        } else if (salary > 1000000) {
            tds = 0.3 * salary;
            return tds;
        } else
            return 0;
    }
}