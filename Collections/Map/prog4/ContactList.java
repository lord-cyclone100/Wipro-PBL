import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class ContactList {
    public static void main(String[] args) {

        HashMap<String, Integer> contacts = new HashMap<>();

        contacts.put("Alice", 987654321);
        contacts.put("Bob", 912345678);
        contacts.put("Charlie", 998877665);

        String keyToCheck = "Bob";
        if (contacts.containsKey(keyToCheck)) {
            System.out.println(keyToCheck + " is in the Contact List.");
        } else {
            System.out.println(keyToCheck + " is not found.");
        }

        Integer valueToCheck = 998877665;
        if (contacts.containsValue(valueToCheck)) {
            System.out.println("Phone number " + valueToCheck + " exists in the Contact List.");
        } else {
            System.out.println("Phone number " + valueToCheck + " not found.");
        }

        System.out.println("\nIterating through contacts:");
        Set<Map.Entry<String, Integer>> entrySet = contacts.entrySet();
        Iterator<Map.Entry<String, Integer>> iterator = entrySet.iterator();

        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            System.out.println("Name: " + entry.getKey() + ", Phone: " + entry.getValue());
        }
    }
}
