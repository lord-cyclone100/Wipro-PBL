import java.util.*;
import java.util.function.Supplier;

public class Test {
    public static void main(String[] args) {
        // Supplier to generate first 10 prime numbers
        Supplier<ArrayList<Integer>> primeSupplier = () -> {
            ArrayList<Integer> primes = new ArrayList<>();
            int num = 2;

            while (primes.size() < 10) {
                if (isPrime(num)) {
                    primes.add(num);
                }
                num++;
            }

            return primes;
        };

        // Get and display the prime list
        ArrayList<Integer> primeList = primeSupplier.get();
        System.out.println("🔢 First 10 Prime Numbers:");
        primeList.forEach(System.out::println);
    }

    // Helper method to check primality
    static boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;

        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) return false;
        }

        return true;
    }
}
