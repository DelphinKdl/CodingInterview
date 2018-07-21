public class ConainsDuplicates {
public boolean doesExits(int[] nums) {
        // Use a hash table. 
        int length = nums.length ;
        // this is brute force. We can do better using HT, but this requires using an auxilary DS.
        // I will do it later using Hash tables.
        for (int i = 0; i<length ; i++ ){
            for (int k = i+1 ; k<length ; k++){
                if (nums[i] == nums[k])
                    return true;
            }
        }
        return false;
    }
}
