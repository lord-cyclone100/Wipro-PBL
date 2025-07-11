public class Test {
  public static void main(String[] args) {
    char ch = ' ';
    if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')){
      System.err.println(ch+" is an alphabet");
    }
    else if(ch >= '0' && ch <= '9'){
      System.out.println(ch+" is a number");
    }
    else{
      System.out.println(ch+" is a special character");
    }
  }  
}
