public class MoveZeros {
  public static void moveMe(int index, int [] a){
    int len = a.length - 1 ;
    for (int i = index; i<len;i++ ) {
      a[i] = a[i+1];
    }
  }
  public static void moveZeroes(int[] nums) {
    int i=0;
    int j=0; // two vars: each is zero.

    while(j<nums.length){
        if(nums[j]==0){
            j++;
        }else{
            nums[i]=nums[j];
            i++;
            j++;
        }
    }

    while(i<nums.length){
        nums[i]=0;
        i++;
    }
}
  public static void main (String [] args){
    int [] arr = {0,1,0,3,0,12,0};
    // {1,2,3,12,0}
    MoveZeros.moveZeroes(arr);
    for (int i : arr){
      System.out.print(i+" ");
    }

  }
}
