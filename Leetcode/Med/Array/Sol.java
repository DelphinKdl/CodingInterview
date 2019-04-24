public class Sol{
  public static int findPeakElement(int[] nums) {
    int ele = nums[0];
    int index = -1;
    int length = nums.length;
    for (int i = 0; i<length-1 ; i++){
        if (nums[i] > nums[i+1]){
            ele = nums[i];
            index = i ;
        }
    }
    return index;
}
  public static void main (String [] args){
    int [] ar = {1,2};
    System.out.println("The index is: "+Sol.findPeakElement(ar));

  }
}
