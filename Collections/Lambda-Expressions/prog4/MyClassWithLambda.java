@FunctionalInterface
interface WordCount {
    int count(String str);
}

public class MyClassWithLambda {
    public static void main(String[] args) {

        WordCount wc = (str) -> {
            if (str == null || str.trim().isEmpty()) return 0;
            return str.trim().split("\\s+").length;
        };


        String input = "Functional programming with lambda is powerful";
        int wordCount = wc.count(input);
        System.out.println("Number of words: " + wordCount);
    }
}
