import java.util.Scanner;

class HalfString{
  public static String getHalfLength(String str){
    int len = str.length();
    if(len%2 != 0){
      return null;
    }
    return str.substring(0, len/2);
  }
}

public class Test {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a string : ");
    String str = sc.next();
    System.out.println(HalfString.getHalfLength(str));
    sc.close();
  }
}
