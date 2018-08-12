import java.util.*;
public class ReverseInteger {
    public  String reverse(int x) {
      String s = Integer.toString(x);
      char []c = s.toCharArray();
      int length = c.length/2;
      int size = c.length;
      for (int i =0;i<=length/2 ;i++ ) {
        if (c[length] == '0'){
          continue;
        }
        char temp = c[i];
        c[i] = c[size-1-i];
        c[size-1-i] = temp ;
      }
      return "s2";
      // return new String(c) ;
    }
    public static void main (String [] args){
    //   ReverseInteger obj = new ReverseInteger();
    // String x =  obj.reverse(-10230);
    // System.out.println(x);
    String s = "anagram";
    String t = "nagaram";
    char [] ss = s.toCharArray();
    char [] tt = t.toCharArray();
    Arrays.sort(ss);
    Arrays.sort(tt);
    String s2 = Arrays.toString(ss);
    String t2 = Arrays.toString(tt);
    System.out.println(s2.equals(t2));
    // System.out.println(t2);

    }
}
