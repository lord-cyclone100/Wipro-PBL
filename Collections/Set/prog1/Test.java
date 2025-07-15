import java.util.HashSet;

public class Test {
    private HashSet<String> H1 = new HashSet<>();

    public HashSet<String> saveCountryNames(String CountryName) {
        H1.add(CountryName);
        return H1;
    }

    public String getCountry(String CountryName) {
        for (String country : H1) {
            if (country.equalsIgnoreCase(CountryName)) {
                return country;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Test storage = new Test();

        storage.saveCountryNames("India");
        storage.saveCountryNames("Japan");
        storage.saveCountryNames("Brazil");
        storage.saveCountryNames("Germany");

        System.out.println("Searching for 'Japan': " + storage.getCountry("Japan"));
        System.out.println("Searching for 'Canada': " + storage.getCountry("Canada"));

        System.out.println("All saved countries:");
        for (String country : storage.saveCountryNames("")) {
            System.out.println(country);
        }
    }
}
