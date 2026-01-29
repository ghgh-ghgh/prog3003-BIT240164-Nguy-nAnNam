
import java.util.HashMap;

public class MainBai8 {
    public static void main(String[] args) {
        EmployeeMap em = new EmployeeMap();
        HashMap<Integer, String> employees = em.getEmployees();

        // Lấy tên nhân viên có ID 102
        System.out.println("Nhân viên ID 102: " + employees.get(102));

        // Kiểm tra ID 105
        if (!employees.containsKey(105)) {
            employees.put(105, "Unknown");
        }

        System.out.println("Danh sách nhân viên: " + employees);
    }
}
