public class Test {
  public static void main(String[] args) {
    int decimal = Integer.parseInt(args[0]);
    System.out.println("Given number : "+decimal);
    System.out.println("Binary Equivalent : "+Integer.toBinaryString(decimal));
    System.out.println("Octal Equivalent : "+Integer.toOctalString(decimal));
    System.out.println("Hexadecimal Equivalent : "+Integer.toHexString(decimal));
  }  
}
