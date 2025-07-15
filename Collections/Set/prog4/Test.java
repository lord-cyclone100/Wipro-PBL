import java.util.TreeSet;

public class Test {

    private TreeSet<String> countries = new TreeSet<>();

    public TreeSet<String> saveCountryNames(String countryName) {
        countries.add(countryName);
        return countries;
    }

    public String getCountry(String countryName) {
        for (String country : countries) {
            if (country.equalsIgnoreCase(countryName)) {
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
        storage.saveCountryNames("Canada");

        System.out.println("Found: " + storage.getCountry("Japan"));
        System.out.println("Found: " + storage.getCountry("Sweden"));

        System.out.println("Sorted Country List:");
        for (String country : storage.saveCountryNames("")) {
            System.out.println(country);
        }
    }
}
