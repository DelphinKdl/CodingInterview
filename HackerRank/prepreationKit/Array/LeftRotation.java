public class LeftRotation{
  static void swap(int []a){
    int d = a.length -1 ;
    for (int i = 0;i<d;i++ ) {
      a[i] = a[i+1];

    }
  }
  static int[] rotLeft(int[] a, int d) {
    int length = a.length-1;
    System.out.println(length);
    for (int i = 0;i<d ;i++ ) {
      int temp = a[0] ; // index needs to be swapped.
      // System.out.println(temp);
      swap(a);
      a[length] = temp;
    }
    return a;
  }

  public static void main (String [] args){
    int [] a = {1,2,3,4,5};
    int d = 5;
    rotLeft(a,d);
    for (int i : a) {
      System.out.print(i+" ");
    }
  }
}
