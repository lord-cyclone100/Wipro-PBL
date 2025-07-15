import java.util.ArrayList;

class Employee {
    int empId;
    String empName;
    String email;
    String gender;
    float salary;

    public Employee(int empId, String empName, String email, String gender, float salary) {
        this.empId = empId;
        this.empName = empName;
        this.email = email;
        this.gender = gender;
        this.salary = salary;
    }

    public void GetEmployeeDetails() {
        System.out.println("Employee ID : " + empId);
        System.out.println("Name : " + empName);
        System.out.println("Email : " + email);
        System.out.println("Gender : " + gender);
        System.out.println("Salary : " + salary);
    }
}

class EmployeeDB {
    ArrayList<Employee> list = new ArrayList<>();

    public boolean addEmployee(Employee e) {
        return list.add(e);
    }

    public boolean deleteEmployee(int empId) {
        for (Employee e : list) {
            if (e.empId == empId) {
                list.remove(e);
                return true;
            }
        }
        return false;
    }

    public String showPaySlip(int empId) {
        for (Employee e : list) {
            if (e.empId == empId) {
                return "Payslip for employee ID " + empId + ": ₹" + e.salary;
            }
        }
        return "Employee not found.";
    }
}

public class Test {
    public static void main(String[] args) {
        EmployeeDB db = new EmployeeDB();

        Employee e1 = new Employee(101, "Alice", "alice@company.com", "Female", 65000);
        Employee e2 = new Employee(102, "Bob", "bob@company.com", "Male", 52000);
        Employee e3 = new Employee(103, "Charlie", "charlie@company.com", "Non-binary", 72000);

        db.addEmployee(e1);
        db.addEmployee(e2);
        db.addEmployee(e3);

        System.out.println("Current Employee List:");
        for (Employee e : db.list) {
            e.GetEmployeeDetails();
        }

        System.out.println(db.showPaySlip(102));

        boolean isDeleted = db.deleteEmployee(101);
        System.out.println("Employee deletion (ID 101): " + (isDeleted ? "Success" : "Failed"));

        System.out.println("\nUpdated Employee List:");
        for (Employee e : db.list) {
            e.GetEmployeeDetails();
        }
    }
}
