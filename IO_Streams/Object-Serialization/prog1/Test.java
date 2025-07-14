import java.io.*;
import java.util.Date;

class Employee implements Serializable {
    private String name;
    private Date dateOfBirth;
    private String department;
    private String designation;
    private double salary;

    // No-argument constructor
    public Employee() {}

    // Parameterized constructor
    public Employee(String name, Date dateOfBirth, String department, String designation, double salary) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.department = department;
        this.designation = designation;
        this.salary = salary;
    }

    // Getter and Setter methods
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public Date getDateOfBirth() { return dateOfBirth; }
    public void setDateOfBirth(Date dateOfBirth) { this.dateOfBirth = dateOfBirth; }

    public String getDepartment() { return department; }
    public void setDepartment(String department) { this.department = department; }

    public String getDesignation() { return designation; }
    public void setDesignation(String designation) { this.designation = designation; }

    public double getSalary() { return salary; }
    public void setSalary(double salary) { this.salary = salary; }

    public void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("DOB: " + dateOfBirth);
        System.out.println("Department: " + department);
        System.out.println("Designation: " + designation);
        System.out.println("Salary: " + salary);
    }
}

public class Test {
    public static void main(String[] args) {
        Employee emp = new Employee("John", new Date(95, 4, 20), "Engineering", "Software Developer", 75000.0);

        // Serialize the object to a file named "data"
        try (FileOutputStream fos = new FileOutputStream("data");
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(emp);
            System.out.println("Employee object has been serialized to 'data'.");
        } catch (IOException e) {
            System.out.println("Serialization error: " + e.getMessage());
        }

        // Deserialize the object from the file
        try (FileInputStream fis = new FileInputStream("data");
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            Employee deserializedEmp = (Employee) ois.readObject();
            System.out.println("\nDeserialized Employee object:");
            deserializedEmp.printDetails();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Deserialization error: " + e.getMessage());
        }
    }
}
