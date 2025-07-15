import java.util.Vector;

public class Test {
    public static void main(String[] args) {
        Vector<String> months = new Vector<>();

        months.add("January");
        months.add("February");
        months.add("March");
        months.add("April");
        months.add("May");
        months.add("June");
        months.add("July");
        months.add("August");
        months.add("September");
        months.add("October");
        months.add("November");
        months.add("December");

        System.out.println("Months using Vector:");
        for (String month : months) {
            System.out.println(month);
        }
    }
}
