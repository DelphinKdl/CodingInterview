import java.util.Arrays;

class SingleNumber {
    public static int singleNumber(int[] nums) {

      int x = 0;
      for (int a : nums) {
          x = x ^ a;
      }
      return x;
  
    }
    public static void main (String [] args){
        int [] x = {2,2,1,1,3};
        int x2 = SingleNumber.singleNumber(x);
        System.out.println(x2);
    }
}
