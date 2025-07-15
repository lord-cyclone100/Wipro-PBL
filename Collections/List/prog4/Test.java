import java.util.ArrayList;

public class Test {
  public static void main(String[] args) {
    ArrayList<Number> list = new ArrayList<>();
    list.add(10);
    list.add(3.14f);
    list.add(2.71828);

    for(Number num:list){
      System.out.print(num+" ");
    }
  }  
}
