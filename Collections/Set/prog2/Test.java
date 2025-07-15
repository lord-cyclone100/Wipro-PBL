import java.util.HashSet;
import java.util.Iterator;

public class Test {
    public static void main(String[] args) {

        HashSet<String> employeeNames = new HashSet<>();

        employeeNames.add("Alice");
        employeeNames.add("Bob");
        employeeNames.add("Charlie");
        employeeNames.add("Diana");
        employeeNames.add("Ethan");

        Iterator<String> iterator = employeeNames.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
