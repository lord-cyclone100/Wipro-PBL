import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {

        List<String> words = Arrays.asList(
            "level", "world", "madam", "java", "civic",
            "rotor", "python", "refer", "noon", "apple"
        );

        Predicate<String> isPalindrome = word -> 
            word.equalsIgnoreCase(new StringBuilder(word).reverse().toString());

        List<String> palindromes = words.stream().filter(isPalindrome).collect(Collectors.toList());

        System.out.println("Palindrome words:");
        palindromes.forEach(System.out::println);
    }
}
