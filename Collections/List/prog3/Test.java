import java.util.ArrayList;
// import java.util.List;

public class Test {
  public static void main(String[] args) {
    ArrayList<String> list = new ArrayList<>();
    list.add("Red");
    list.add("Yellow");
    list.add("Green");
    list.add("Blue");

    Test test = new Test();
    test.printAll(list);
  }
  void printAll(ArrayList<String> list){
    for(String color:list){
      System.out.print(color+" ");
    }
  }
  
}
