import java.util.Hashtable;
import java.util.ArrayList;
class SingleNumber {
    public int singleNumber(int[] nums) {
        // Find the single number in an array.
        return 0 ;
    }
    public static void main (String [] args){
      SingleNumber s = new SingleNumber();
      int [] ints  = {4,1,2,1,2};
      ArrayList s1 = new ArrayList();
      Hashtable <Integer, ArrayList<Integer>> table = new Hashtable <Integer, ArrayList<Integer>>();
      for (int i =  0; i < 5 ; i ++){
        if (table.contains(i) == false){
          s1.add(ints[i]);
          table.put(i, s1);
        }
      }
      // Does not make sense.

      // I will fix the error.
      System.out.println(table.get(5));
    }
}
