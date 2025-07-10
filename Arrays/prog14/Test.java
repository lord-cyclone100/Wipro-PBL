public class Test {
  public static void main(String[] args) {
    int arr[][] = new int [3][3];
    int idx = 0;
    for(int i=0;i<3;i++){
      for(int j=0;j<3;j++){
        arr[i][j] = Integer.parseInt(args[idx++]);
      }
    }
    System.out.println("The given array : ");
    for(int i=0;i<3;i++){
      for(int j=0;j<3;j++){
        System.out.print(arr[i][j]+" ");
      }
      System.err.println();
    }
    int max = arr[0][0];
    for(int i=0;i<3;i++){
      for(int j=0;j<3;j++){
        if(arr[i][j] > max){
          max = arr[i][j];
        }
      }
    }
    System.err.println("Maximum element : "+max);
  }  
}
