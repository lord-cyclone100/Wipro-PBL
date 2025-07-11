import java.util.Scanner;

public class Test {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number : ");
    int num = sc.nextInt();
    int sum = 0;
    while(num > 0){
      int digit = sum%10;
      sum += digit;
      num = num/10;
    }
    System.out.println("The sum of digits = "+sum);
  }
}
