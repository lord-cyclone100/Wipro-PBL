import java.util.*;

public class Test {
    // Instance variable M1 using TreeMap (sorted by country name)
    private TreeMap<String, String> M1 = new TreeMap<>();

    // 1. Save country-capital pair
    public TreeMap<String, String> saveCountryCapital(String countryName, String capital) {
        M1.put(countryName, capital);
        return M1;
    }

    // 2. Get capital by country name
    public String getCapital(String countryName) {
        return M1.get(countryName);
    }

    // 3. Get country by capital name
    public String getCountry(String capitalName) {
        for (Map.Entry<String, String> entry : M1.entrySet()) {
            if (entry.getValue().equalsIgnoreCase(capitalName)) {
                return entry.getKey();
            }
        }
        return null;
    }

    // 4. Create reverse map M2: Capital -> Country
    public TreeMap<String, String> createCapitalCountryMap() {
        TreeMap<String, String> M2 = new TreeMap<>();
        for (Map.Entry<String, String> entry : M1.entrySet()) {
            M2.put(entry.getValue(), entry.getKey());
        }
        return M2;
    }

    // 5. Get list of all countries
    public ArrayList<String> getAllCountries() {
        return new ArrayList<>(M1.keySet());
    }

    // Main method to test everything
    public static void main(String[] args) {
        Test manager = new Test();

        manager.saveCountryCapital("India", "Delhi");
        manager.saveCountryCapital("Japan", "Tokyo");
        manager.saveCountryCapital("France", "Paris");
        manager.saveCountryCapital("Germany", "Berlin");

        // Test getCapital
        System.out.println("Capital of France: " + manager.getCapital("France"));

        // Test getCountry
        System.out.println("Country for capital 'Berlin': " + manager.getCountry("Berlin"));

        // Display M2 (capital ➝ country)
        System.out.println("\nCapital -> Country:");
        TreeMap<String, String> M2 = manager.createCapitalCountryMap();
        M2.forEach((cap, country) -> System.out.println(cap + " -> " + country));

        // List all countries
        System.out.println("\nAll Countries in M1:");
        manager.getAllCountries().forEach(System.out::println);
    }
}
