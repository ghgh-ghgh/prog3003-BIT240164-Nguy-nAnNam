import java.util.HashMap;

class EmployeeMap {
    public HashMap<Integer, String> getEmployees() {
        HashMap<Integer, String> employees = new HashMap<>();
        employees.put(101, "Anna");
        employees.put(102, "Peter");
        employees.put(103, "Mary");
        return employees;
    }
}
