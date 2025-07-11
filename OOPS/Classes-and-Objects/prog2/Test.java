class Calculator{
  public static int powerInt(int num1, int num2){
    return ((int)Math.pow(num1, num2));
  }
  public static double powerDouble(double num1, double num2){
    return Math.pow(num1, num2);
  }
}

public class Test {
  public static void main(String[] args) {
    // Calculator calci = new Calculator();
    System.out.println(Calculator.powerInt(5, 3));
    System.out.println(Calculator.powerDouble(2.5, 1.4));
  }  
}
