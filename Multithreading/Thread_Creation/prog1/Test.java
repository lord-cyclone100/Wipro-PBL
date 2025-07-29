class ScoobyThread extends Thread{
  ScoobyThread(){
    super("Scooby");
  }
  public void run(){
    System.out.println("Thread name : "+this.getName());
  }
}

class ShaggyThread extends Thread{
  ShaggyThread(){
    super("Shaggy");
  }
  public void run(){
    System.out.println("Thread name : "+this.getName());
  }
}

public class Test {
  public static void main(String[] args) {
    ScoobyThread scooby = new ScoobyThread();
    ShaggyThread shaggy = new ShaggyThread();
    scooby.start();
    shaggy.start();    
  }  
}
