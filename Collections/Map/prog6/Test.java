import java.util.*;

public class Test {
    // Instance variable M1 using Hashtable
    private Hashtable<String, String> M1 = new Hashtable<>();

    // 1. Save country-capital pair
    public Hashtable<String, String> saveCountryCapital(String countryName, String capital) {
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

    // 4. Create reverse map M2: Capital ➝ Country
    public Hashtable<String, String> createCapitalCountryMap() {
        Hashtable<String, String> M2 = new Hashtable<>();
        for (Map.Entry<String, String> entry : M1.entrySet()) {
            M2.put(entry.getValue(), entry.getKey());
        }
        return M2;
    }

    // 5. Get list of all countries
    public ArrayList<String> getAllCountries() {
        return new ArrayList<>(M1.keySet());
    }

    // Main method to test all methods
    public static void main(String[] args) {
        Test manager = new Test();

        // Saving entries
        manager.saveCountryCapital("India", "Delhi");
        manager.saveCountryCapital("Japan", "Tokyo");
        manager.saveCountryCapital("France", "Paris");
        manager.saveCountryCapital("Germany", "Berlin");

        // Test getCapital
        System.out.println("Capital of India: " + manager.getCapital("India"));

        // Test getCountry
        System.out.println("Country for capital 'Tokyo': " + manager.getCountry("Tokyo"));

        // Reverse Map
        Hashtable<String, String> M2 = manager.createCapitalCountryMap();
        System.out.println("\nM2 (Capital ➝ Country):");
        M2.forEach((capital, country) -> System.out.println(capital + " ➝ " + country));

        // Get all countries
        ArrayList<String> countries = manager.getAllCountries();
        System.out.println("\nAll Countries in M1:");
        countries.forEach(System.out::println);
    }
}
