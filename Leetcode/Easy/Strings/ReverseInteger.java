public class ReverseInteger {
    public static int reverse(int x) {
        String str =  Integer.toString(x);
        int length = str.length() -1 ;
        // if (str.charAt(length) == '0')
        String temp = "";
        for (int i = length ; i>=0 ; i--){
            if (str.charAt(length-1) == '0' )
                continue;
            else
            temp+=str.charAt(i);
        }
        return Integer.parseInt(temp);
    }
    public static void main (String[] args){
      int x = ReverseInteger.reverse(-1230);

      System.out.println(x);
    }
}
