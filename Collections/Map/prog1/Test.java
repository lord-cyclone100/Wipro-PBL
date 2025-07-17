import java.util.*;

public class Test {
    private HashMap<String, String> M1 = new HashMap<>();

    // 1. Method to save country-capital pair and return M1
    public HashMap<String, String> saveCountryCapital(String countryName, String capital) {
        M1.put(countryName, capital);
        return M1;
    }

    // 2. Method to get capital by country name
    public String getCapital(String countryName) {
        return M1.get(countryName);
    }

    // 3. Method to get country by capital name
    public String getCountry(String capitalName) {
        for (Map.Entry<String, String> entry : M1.entrySet()) {
            if (entry.getValue().equalsIgnoreCase(capitalName)) {
                return entry.getKey();
            }
        }
        return null; // Not found
    }

    // 4. Method to create and return M2 (capital ➝ country)
    public HashMap<String, String> createCapitalCountryMap() {
        HashMap<String, String> M2 = new HashMap<>();
        for (Map.Entry<String, String> entry : M1.entrySet()) {
            M2.put(entry.getValue(), entry.getKey());
        }
        return M2;
    }

    // 5. Method to return an ArrayList of all country names
    public ArrayList<String> getAllCountries() {
        return new ArrayList<>(M1.keySet());
    }

    // Main method to test the features
    public static void main(String[] args) {
        Test manager = new Test();

        // Adding country-capital pairs
        manager.saveCountryCapital("India", "Delhi");
        manager.saveCountryCapital("Japan", "Tokyo");
        manager.saveCountryCapital("France", "Paris");

        // Testing getCapital
        System.out.println("Capital of Japan: " + manager.getCapital("Japan"));

        // Testing getCountry
        System.out.println("Country with capital 'Paris': " + manager.getCountry("Paris"));

        // Creating M2 and displaying it
        HashMap<String, String> M2 = manager.createCapitalCountryMap();
        System.out.println("\nM2 (Capital ➝ Country):");
        M2.forEach((capital, country) -> System.out.println(capital + " ➝ " + country));

        // Displaying all country names
        ArrayList<String> countries = manager.getAllCountries();
        System.out.println("\nCountries in M1:");
        countries.forEach(System.out::println);
    }
}
