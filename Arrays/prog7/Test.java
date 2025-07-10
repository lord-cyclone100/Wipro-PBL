class Demo{
  public void removeDuplicates(int arr[]){
    int n = arr.length;
    int[] temp = new int[n];
    int uniqueCount = 0;
    for (int i = 0; i < n; i++) {
      boolean isDuplicate = false;
      for (int j = 0; j < uniqueCount; j++) {
        if (arr[i] == temp[j]) {
          isDuplicate = true;
          break;
        }
      }
      if (!isDuplicate) {
        temp[uniqueCount] = arr[i];
        uniqueCount++;
      }
    }
    System.out.print("Array after removing duplicates: ");
    for (int i = 0; i < uniqueCount; i++) {
      System.out.print(temp[i] + " ");
    }
  }
}

public class Test {
  public static void main(String[] args) {
    int arr[] = {12,34,12,45,67,89};
    Demo d = new Demo();
    d.removeDuplicates(arr);
  }  
}
