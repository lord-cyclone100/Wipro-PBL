import java.util.Vector;
import java.util.Iterator;
import java.util.Enumeration;

class Employee {
    int empId;
    String empName;
    float salary;

    public Employee(int empId, String empName, float salary) {
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
    }

    public void printDetails() {
        System.out.println("ID: " + empId + ", Name: " + empName + ", Salary: ₹" + salary);
    }
}

public class Test {
    public static void main(String[] args) {
        Vector<Employee> employeeVector = new Vector<>();

        employeeVector.add(new Employee(101, "Alice", 60000));
        employeeVector.add(new Employee(102, "Bob", 55000));
        employeeVector.add(new Employee(103, "Charlie", 72000));

        System.out.println("Listing using Iterator:");
        Iterator<Employee> iterator = employeeVector.iterator();
        while (iterator.hasNext()) {
            iterator.next().printDetails();
        }

        System.out.println("Listing using Enumeration:");
        Enumeration<Employee> enumeration = employeeVector.elements();
        while (enumeration.hasMoreElements()) {
            enumeration.nextElement().printDetails();
        }
    }
}
