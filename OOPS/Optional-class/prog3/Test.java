import java.util.Optional;

class InvalidEmployeeException extends Exception{
  InvalidEmployeeException(){
    super("Invalid Employee Exception encountered");
  }
}

class Employee{
  Employee(){
    System.out.println("New Employee");
  }
}

public class Test {
  public static void main(String[] args) {
    Employee emp = null;
    Optional <Employee> e = Optional.ofNullable(emp);
    try {
      System.out.println(e.orElseThrow(InvalidEmployeeException::new));
    } catch (InvalidEmployeeException ex) {
      System.out.println(ex.getMessage());
    }
  }  
}
