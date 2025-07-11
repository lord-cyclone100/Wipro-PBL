import java.util.Scanner;

class JoinStrings{
  public static String joinTheStrings(String str1, String str2){
    int len1 = str1.length();
    int len2 = str2.length();
    return len1>len2 ? str2+str1+str2 : str1+str2+str1;
  }
}

public class Test {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter 1st string : ");
    String str1 = sc.next();
    System.out.print("Enter 2nd string : ");
    String str2 = sc.next();

    System.out.println(JoinStrings.joinTheStrings(str1, str2));

    sc.close();
  }  
}
