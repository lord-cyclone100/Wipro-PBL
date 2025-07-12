import java.util.Random;

abstract class Compartment{
  abstract public void notice();
}

class FirstClass extends Compartment{
  public void notice(){
    System.out.println("This is First Class Compartment");
  }
}

class Ladies extends Compartment{
  public void notice(){
    System.out.println("This is Ladies Compartment");
  }
}

class General extends Compartment{
  public void notice(){
    System.out.println("This is General Compartment");
  }
}

class Luggage extends Compartment{
  public void notice(){
    System.out.println("This is Luggage Compartment");
  }
}

public class TestCompartment {
  public static void main(String[] args){
    Compartment comp[] = new Compartment[10];
    Random r = new Random(4);
    for (int i = 0; i < comp.length; i++){
      int type = r.nextInt(4) + 1;
      switch (type) {
        case 1:
          comp[i] = new FirstClass();
          break;
        case 2:
          comp[i] = new Ladies();
          break;
        case 3:
          comp[i] = new General();
          break;
        case 4:
          comp[i] = new Luggage();
          break;
      }
    }

    for (int i = 0; i < comp.length; i++){
      System.out.print("Compartment " + (i + 1) + ": ");
      comp[i].notice();
    }
  }
}
