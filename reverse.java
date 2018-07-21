public class reverse {
    public static int [] Revers(int [] a) {

        int length = a.length ; 
        
        int [] temp = new int [length]; 
        int k = 0 ; 
        for (int i = length-1 ; i >=0 ; i--) {
            temp[a.length-i-1] = a[i]; 
        }
      return temp ;   
    }
    public static void main (String [] args) {
        int [] arr = {1,2,3,4};
        arr = reverse.Revers(arr);
        for (int i = 0 ; i<arr.length ; i++) {
            System.out.println(arr[i]);
        }

    }
}