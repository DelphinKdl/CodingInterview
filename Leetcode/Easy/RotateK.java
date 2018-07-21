public class RotateK {
public static void shiftMe(int [] arr, int index){
        for (int i = index; i>=0 ; i--){
            arr[i+1] = arr[i] ;    
     }
    }
    public void rotate(int[] nums, int k) {
        int length  = nums.length ; 

        while (k>0) {
            int temp = nums[length-1]; // Always the last items.
            // Shift everything.
            shiftMe(nums, length-2);
            nums[0] = temp ;
            k--;
        }
    }
    }
