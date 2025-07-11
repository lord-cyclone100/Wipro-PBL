import java.util.Scanner;

class TrimString{
  public static String trimTheString(String str){
    int len = str.length();
    char first = str.charAt(0);
    char last = str.charAt(len-1);
    if(first == 'x' && last == 'x'){
      return str.substring(1, len-1);
    }
    else if(first == 'x'){
      return str.substring(1, len-1);
    }
    else if (last == 'x'){
      return str.substring(0, len-1);
    }
    else{
      return str;
    }
  }
}

public class Test{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the string : ");
    String str = sc.next();
    System.out.println(TrimString.trimTheString(str));
    sc.close();
  }
}
