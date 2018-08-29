public class TwoSums {
  public static int[] twoSum(int[] nums, int target) {
    int [] indices = new int [2];
    int length = nums.length-1;
    for (int i = 0 ; i<length; i++){
        for (int j= i+1; j<length+1 ; j++ ){
            if (target == (nums[i] + nums[j])){
            indices[0] = i ;
            indices[1]= j;
            return indices;
        }
        }
    }
    return indices;


}
  public static void main (String [] args){
    int [] a = {3,2,0,3};
      int [] indices = new int [2];
    indices = TwoSums.twoSum(a,6);

    for (int i : indices ) {
      System.out.print(i+" ");
    }


  }
}
