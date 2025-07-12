import java.util.Scanner;

class NegativeNumberException extends Exception{
  public NegativeNumberException(String str){
    super(str);
  }
}

class NumberOutOfRangeException extends Exception{
  public NumberOutOfRangeException(String str){
    super(str);
  }
}


public class Test {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    try{
      System.out.println("Enter Student 1 name : ");
      String name1 = sc.next();
      System.out.println("Enter Student 1 marks 1 : ");
      int s1marks1 = Integer.parseInt(sc.next());
      System.out.println("Enter Student 1 marks 1 : ");
      int s1marks2 = Integer.parseInt(sc.next());
      System.out.println("Enter Student 2 name : ");
      String name2 = sc.next();
      System.out.println("Enter Student 2 marks 1 : ");
      int s2marks1 = Integer.parseInt(sc.next());
      System.out.println("Enter Student 2 marks 2 : ");
      int s2marks2 = Integer.parseInt(sc.next());
      if(s1marks1 < 0 || s1marks2 < 0 || s2marks1 < 0 || s2marks2 < 0){
        throw new NegativeNumberException("Number entered is negative");
      }
      if(s1marks1 > 100 || s1marks2 > 100 || s2marks1 > 100 || s2marks2 > 100){
        throw new NumberOutOfRangeException("Number entered is out of range");
      }
    }
    catch(NumberFormatException nfe){
      nfe.printStackTrace();
    }
    catch(NegativeNumberException nne){
      nne.getMessage();
    }
    catch(NumberOutOfRangeException noore){
      noore.getMessage();
    }
  }
}
