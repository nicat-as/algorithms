class Main {
  /*
    Task: There are ordered number array to the n. But in this array 
    one number is missing. Find that number.
  
  */
  public static void main(String[] args) {
    getRemovedNumber(new int[]{1,2,4,5,6,7,8}, 8);
  }

  public static int getRemovedNumber(int[] arr,int n){
    int numberLeft=0;
    int left=0;
    int right= arr.length-1;
    int result = -1;
    while(left<=right){
      int middle = left+(right-left)/2;
      int numberMiddle = numberLeft + (n-numberLeft)/2;
      if(numberMiddle==arr[middle]){
        left=middle+1;
        numberLeft=numberMiddle+1;
      }

      if(numberMiddle<arr[middle]){
        right=middle-1;
        n=numberMiddle;
        result=numberMiddle;
      }

      System.out.println(arr[middle] + " : "  + numberMiddle);

    }
    System.out.println("Result: " + result);
    return result;
  }
}
