import java.util.Scanner;

class RemoveChars{
  public static String removeStars(String str){
    StringBuffer sb = new StringBuffer();
    int len = str.length();
    for(int i=0;i<len;i++){
      if(str.charAt(i) != '*'){
        sb.append(str.charAt(i));
      }
    }
    return sb.toString();
  }
}

public class Test {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a string : ");
    String str = sc.next();
    System.out.println(RemoveChars.removeStars(str));
    sc.close();
  }
}
