class Employee{
  int empNo;
  String empName;
  String joinDate;
  char desgCode;
  String department;
  int basic;
  int hra;
  int it;

  public Employee(int empNo, String empName, String joinDate, char desgCode, String department, int basic, int hra, int it){
    this.empNo = empNo;
    this.empName = empName;
    this.joinDate = joinDate;
    this.desgCode = desgCode;
    this.department = department;
    this.basic = basic;
    this.hra = hra;
    this.it = it;
  }

  static int getDA(char desgCode) {
    switch (desgCode) {
      case 'e': return 20000;
      case 'c': return 32000;
      case 'k': return 12000;
      case 'r': return 15000;
      case 'm': return 40000;
      default:  return 0;
    }
  }

  public static String getDesignation(char code) {
    return switch (code) {
      case 'e' -> "Engineer";
      case 'c' -> "Consultant";
      case 'k' -> "Clerk";
      case 'r' -> "Receptionist";
      case 'm' -> "Manager";
      default -> "Unknown";
    };
  }
}

public class Test {
  public static void main(String[] args) {
    if(args.length != 1){
      System.out.println("Please enter an employee id");
      return;
    }
    int id = Integer.parseInt(args[0]);
    Employee[] employees = {
      new Employee(1001, "Ashish", "01/04/2009", 'e', "R&D", 20000, 8000, 3000),
      new Employee(1002, "Sushma", "23/08/2012", 'c', "PM", 30000, 12000, 9000),
      new Employee(1003, "Rahul", "12/11/2008", 'k', "Acct", 10000, 8000, 1000),
      new Employee(1004, "Chahat", "29/01/2013", 'r', "Front Desk", 12000, 6000, 2000),
      new Employee(1005, "Ranjan", "16/07/2005", 'm', "Engg", 50000, 20000, 20000),
      new Employee(1006, "Suman", "1/1/2000", 'e', "Manufacturing", 23000, 9000, 4400),
      new Employee(1007, "Tanmay", "12/06/2006", 'c', "PM", 29000, 12000, 10000)
    };

    

    boolean isFound = false;
    for(Employee emp:employees){
      if(emp.empNo == id){
        isFound = true;
        int da = Employee.getDA(emp.desgCode);
        int sal = emp.basic + emp.hra + da + emp.it;
        System.out.println("Employee No :" + emp.empNo);
        System.out.println("Employee Name :" + emp.empName);
        System.out.println("Department :" + emp.department);
        System.out.println("Designation :" + Employee.getDesignation(emp.desgCode));
        System.out.println("Salary :" + sal);
        break;
      }
    }
  }
}
