import java.util.Scanner;

class Demo{
  public static String extractLast(String str, int num){
    int len = str.length();
    // String strArr[] = new String[num*num];
    StringBuffer sb = new StringBuffer();
    for(int i=num;i>0;i--){
      sb.append(str.substring(len-num, len));
    }
    return sb.toString();
  }
}

public class Test {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a string : ");
    String str = sc.next();
    System.out.print("Enter a number : ");
    int num = sc.nextInt();
    System.out.println(Demo.extractLast(str, num));
    sc.close();
  }  
}
