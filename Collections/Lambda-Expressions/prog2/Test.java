import java.util.ArrayList;
import java.util.Collections;

public class Test {
  public static void main(String[] args){
    ArrayList<String> al = new ArrayList<>();
    al.add("Red");
    al.add("Yellow");
    al.add("Green");
    al.add("Blue");
    al.add("Purple");
    al.add("Brown");
    al.add("Black");
    al.add("White");
    al.add("Cyan");
    al.add("Magenta");

    Collections.reverse(al);
    System.out.println(al);
    al.forEach(color -> System.out.println(color));
  }
}
