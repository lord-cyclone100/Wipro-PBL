public class Test {
  public static void main(String[] args) {
    int arr[] = {1,2,3,4,5};
    int max = arr[0];
    int min = arr[0];
    for(int i=1;i<arr.length;i++){
      if(arr[i]>max){
        max = arr[i];
      }
      if(arr[i]<min){
        min = arr[i];
      }
    }
    System.out.println("Max element : "+max);
    System.out.println("Min element : "+min);
  }  
}
