import java.util.TreeSet;
import java.util.Iterator;
import java.util.NavigableSet;

public class Test {
    public static void main(String[] args) {

        TreeSet<String> countries = new TreeSet<>();

        countries.add("India");
        countries.add("Brazil");
        countries.add("Canada");
        countries.add("Denmark");
        countries.add("Australia");

        // a) Reverse the elements of the Collection
        System.out.println("🔁 Countries in Reverse Order:");
        NavigableSet<String> reverseCountries = countries.descendingSet();
        for (String country : reverseCountries) {
            System.out.println(country);
        }

        // b) Iterate the elements using Iterator
        System.out.println("\n📋 Countries using Iterator:");
        Iterator<String> iterator = countries.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // c) Check if a particular element exists
        String search = "Canada";
        boolean exists = countries.contains(search);
        System.out.println("Does '" + search + "' exist? " + (exists ? "Yes" : "No"));
    }
}
