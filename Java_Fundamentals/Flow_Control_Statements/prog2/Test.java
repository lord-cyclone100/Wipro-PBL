public class Test {
  public static void main(String[] args){
    int num = Integer.parseInt(args[0]);
    if(num%2 == 0){
      System.out.println(num+" is an even number");
    }
    else{
      System.out.println(num+" is an odd number");
    }
  }
}
