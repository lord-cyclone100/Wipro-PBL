import java.util.Scanner;

public class Test {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number : ");
    int num = sc.nextInt();
    String binary = Integer.toBinaryString(num);
    String eightBitBinary = String.format("%8s",binary).replace(' ', '0');
    System.out.println(eightBitBinary);
  }  
}
