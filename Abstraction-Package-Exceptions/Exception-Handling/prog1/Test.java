import java.util.InputMismatchException;
import java.util.Scanner;

public class Test {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the size of array : ");
    int size = sc.nextInt();
    int arr[] = new int[size];
    System.out.print("Enter array elements : ");
    try{
      for(int i=0;i<size;i++){
        arr[i] = Integer.parseInt(sc.next());
      }
      System.out.print("Enter an index of the array element you wish to access : ");
      int idx = sc.nextInt();
      System.out.println("Element at index "+idx+" is : "+arr[idx]);
    }
    catch(NumberFormatException nfe){
      System.out.println(nfe.getClass().getName());
    }
    catch(ArrayIndexOutOfBoundsException aioobe){
      System.out.println(aioobe.getClass().getName());
    }
  }  
}
