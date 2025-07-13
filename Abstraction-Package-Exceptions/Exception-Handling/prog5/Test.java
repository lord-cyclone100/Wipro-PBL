class InvalidAgeException extends Exception{
  InvalidAgeException(String str){
    super(str);
  }
}

public class Test {
  public static void main(String[] args) {
    String name = args[0];
    int age = Integer.valueOf(args[1]);
    try{
      if(age < 18 || age > 60){
        throw new InvalidAgeException("Age is either less than 18 or more than 60");
      }
      System.out.println("Age is valid");
    }
    catch(InvalidAgeException iae){
        System.out.println(iae.getMessage());
    }
  } 
}
