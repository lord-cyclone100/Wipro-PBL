public class Employee extends Person{
  private double annualSalary;
  private int yearOfJoining;
  private String nin;

  public Employee(String name, double annualSalary, int yearOfJoining, String nin){
    super(name);
    this.annualSalary = annualSalary;
    this.yearOfJoining = yearOfJoining;
    this.nin = nin;
  }

  public double getAnnualSalary() {
    return annualSalary;
  }

  public int getYearOfJoining() {
    return yearOfJoining;
  }

  public String getNIN() {
    return nin;
  }



  public void setAnnualSalary(double annualSalary) {
    this.annualSalary = annualSalary;
  }

  public void setYearOfJoining(int yearOfJoining) {
    this.yearOfJoining = yearOfJoining;
  }

  public void setNIN(String nin) {
    this.nin = nin;
  }

  public void getEmployeeDetails(){
    System.out.println("Employee Name : "+name+"\nSalary : "+annualSalary+"\nYear of Joining : "+yearOfJoining+"\nNational Insurance Number : "+nin);
  }
}