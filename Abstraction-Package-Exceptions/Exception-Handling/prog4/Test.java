import java.util.Scanner;

class InvalidCountryException extends Exception{
  InvalidCountryException(String str){
    super(str);
  }
}

class UserRegistration{
  String username;
  String userCountry;
  UserRegistration(String username, String userCountry){
    this.username = username;
    this.userCountry = userCountry;
  }
  static void registerUser(String username, String userCountry){
    try {
      if(!(userCountry.equals("India"))){
        throw new InvalidCountryException("User outside India cannot be registered");
      }
      System.out.println("User registration done successfully");
    } catch (InvalidCountryException ice) {
        System.out.println(ice.getMessage());
    }
  }
}

public class Test {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter username : ");
    String name = sc.next();
    System.out.print("Enter country : ");
    String country = sc.next();
    UserRegistration.registerUser(name, country);
    sc.close();
  }
}
