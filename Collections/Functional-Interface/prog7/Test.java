import java.util.*;
import java.util.function.Consumer;

public class Test {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(2, 5, 8, 13, 7, 10, 1, 4, 9, 6);

        Consumer<Integer> displayOddEven = num -> {
            String result = (num % 2 == 0) ? "even" : "odd";
            System.out.println(num + " " + result);
        };

        numbers.forEach(displayOddEven);
    }
}
