package exercise;

public class EmployeeAdapterFactory {
    public static Employee create(Object employee) {
        if (employee instanceof EmployeeDB) {
            return new EmployeeDBAdapter((EmployeeDB) employee);
        } else if (employee instanceof EmployeeCSV) {
            return new EmployeeCSVAdapter((EmployeeCSV) employee);
        } else if (employee instanceof EmployeeLDAP) {
            return new EmployeeLDAPAdapter((EmployeeLDAP) employee);
        } else {
            throw new IllegalArgumentException("Unknown employee type");
        }
    }
}