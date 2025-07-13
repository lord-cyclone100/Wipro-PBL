class Employee implements Cloneable{
  String name;
  int id;

  Employee(String name, int id){
    this.name = name;
    this.id = id;
  }

  Employee cloneEmployee() {
    try{
      return (Employee) super.clone();
    } catch (CloneNotSupportedException e){
        System.out.println("Clone not supported");
        return this;
    }
  }
}

public class Test {
  public static void main(String[] args) {
    Employee original = new Employee("John Doe", 101);
    Employee clone = original.cloneEmployee();

    original.name = "John Derek";
    original.id = 202;

    System.out.println("Original: " + original.name + ", " + original.id);
    System.out.println("Clone: " + clone.name + ", " + clone.id);
  }
}
