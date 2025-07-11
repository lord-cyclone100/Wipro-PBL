import java.util.Scanner;

class Demo{
  public int getElement(int arr[], int key){
    for(int i=0;i<arr.length;i++){
      if(arr[i] == key){
        return i;
      }
    }
    return -1;
  }
}

public class Test {
  public static void main(String[] args) {
    int arr[] = {1,4,34,56,7};
    Scanner sc = new Scanner(System.in);
    Demo demo = new Demo();
    System.err.print("Enter an element to search : ");
    int key = sc.nextInt();
    System.out.println(demo.getElement(arr, key));
  }  
}
