import java.util.StringJoiner;

public class Test {
	public static void main(String[] args) {
		StringJoiner s1 = new StringJoiner("-");
		s1.add("Delhi");
		s1.add("Mumbai");
		s1.add("Kolkata");

		StringJoiner s2 = new StringJoiner("-");
		s2.add("Chennai");
		s2.add("Bangalore");
		s2.add("Hyderabad");

		StringJoiner merge1 = new StringJoiner("-");
		merge1.merge(s2);
		merge1.merge(s1);
		System.out.println("s1 merged to s2: " + merge1);

		StringJoiner merge2 = new StringJoiner("-");
		merge2.merge(s1);
		merge2.merge(s2);
		System.out.println("s2 merged to s1: " + merge2);
	}
}
