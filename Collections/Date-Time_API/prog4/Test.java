import java.time.LocalDate;

public class Test {
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();

        int year = currentDate.getYear();
        boolean isLeap = currentDate.isLeapYear();

        System.out.println(year + (isLeap ? " is a Leap Year" : " is Not a Leap Year"));
    }
}
