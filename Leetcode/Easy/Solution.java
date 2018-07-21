import java.util.Set;
class Solution {
    public static void shiftLeft(int [] nums, int index){
        int length = nums.length ; // DP
        for (int i = index ; i<length-1 ; i++){
            nums[i] = nums[i+1] ; 
        }
    }
    public static void moveZeroes(int[] nums) {
        // Algorithm.
        // 1- Find a zero.
        // 2- Shift the array.
        // Repeat.
        int length = nums.length ; 
        for (int i = 0 ;  i<length ; i++){
            if (nums[i] == 0){
                int temp = nums[i];// Store the store.
                shiftLeft(nums, i);
                nums[length-1] = temp;
            }
        }
    }
    public static void main (String [] args){
        int [] nums = {0,0,1};
        Solution.moveZeroes(nums);
        int length = nums.length ; 
        for (int i = 0; i < length; i++)
        System.out.print(nums[i]+ " ");
        System.out.println();
        String str =  Integer.toString(nums[1]);;
        System.out.println(str);
        Set x = new Set();
        
    }

   
}