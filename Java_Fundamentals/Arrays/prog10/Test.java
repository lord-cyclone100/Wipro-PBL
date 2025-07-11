public class Test {
  public static void main(String[] args) {
    int arr[] = {1,0,1,0,0,1,1};
    int len = arr.length;
    int[] newArr = new int[len];
    int front = 0;
    int back = len-1;
    for(int i=0;i<len;i++){
      if(arr[i] %2 == 0){
        newArr[front++] = arr[i];
      }
      else{
        newArr[back--] = arr[i];
      }
    }
    System.out.println("Modified array : ");
    for(int i=0;i<len;i++){
      System.out.print(newArr[i]+" ");
    }
  }  
}
