import java.util.*;
import java.util.stream.*;

class Student {
    int rollNo;
    String name;
    int mark;

    public Student(int rollNo, String name, int mark) {
        this.rollNo = rollNo;
        this.name = name;
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "RollNo: " + rollNo + ", Name: " + name + ", Mark: " + mark;
    }
}

public class Test {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
            new Student(101, "Arjun", 45),
            new Student(102, "Meera", 68),
            new Student(103, "Ravi", 52),
            new Student(104, "Sneha", 39),
            new Student(105, "Kabir", 77)
        );

        List<Student> clearedStudents = students.stream().filter(s -> s.mark >= 50).collect(Collectors.toList());

        System.out.println("✅ Students who cleared the test:");
        clearedStudents.forEach(System.out::println);

        System.out.println("\nTotal Cleared: " + clearedStudents.size());
    }
}
