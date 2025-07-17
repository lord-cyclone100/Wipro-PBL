import java.util.*;

public class Test {
    public static void main(String[] args) {

        HashMap<String, String> stringMap = new HashMap<>();

        stringMap.put("India", "Delhi");
        stringMap.put("Japan", "Tokyo");
        stringMap.put("France", "Paris");
        stringMap.put("USA", "Washington");
        stringMap.put("Germany", "Berlin");

        // a) Check if a particular key exists
        String checkKey = "Japan";
        if (stringMap.containsKey(checkKey)) {
            System.out.println("Key '" + checkKey + "' exists with value: " + stringMap.get(checkKey));
        } else {
            System.out.println("Key '" + checkKey + "' does not exist.");
        }

        // b) Check if a particular value exists
        String checkValue = "Berlin";
        if (stringMap.containsValue(checkValue)) {
            System.out.println("Value '" + checkValue + "' exists in the map.");
        } else {
            System.out.println("Value '" + checkValue + "' not found in the map.");
        }

        // c) Use Iterator to loop through the map
        System.out.println("Iterating through the map using Iterator:");
        Iterator<Map.Entry<String, String>> iterator = stringMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> entry = iterator.next();
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}
