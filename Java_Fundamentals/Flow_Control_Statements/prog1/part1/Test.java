public class Test {
  public static void main(String[] args) {
    int num = Integer.parseInt(args[0]);
    if(num > 0){
      System.out.println(num+" is positive");
    }
    else if(num == 0){
      System.out.println(num+" is Zero");
    }
    else{
      System.out.println(num+" is negative");
    }
  }
}
