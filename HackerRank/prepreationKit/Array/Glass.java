public class Glass{
  public static void main (String [] args){

      int [][]a = {
      {-9 ,-9 ,-9  ,1 ,1 ,1 },// We Want to run it 4 timess.
      { 0 ,-9  ,0  ,4 ,3 ,2},
      {-9 ,-9, -9 , 1 ,2 ,3},
      { 0  ,0  ,8  ,6 ,6 ,0},
      { 0  ,0 , 0 ,-2 ,0 ,0},
      { 0  ,0  ,1  ,2 ,4 ,0},
    };

    int max = Integer.MIN_VALUE;

    int length = a.length-2;
           for(int i=0; i<length; i++){
               for(int j=0; j<length; j++){
                   int val=a[i][j]+ a[i][j+1] + a[i][j+2] + a[i+1][j+1] + a[i+2][j]+ a[i+2][j+1] + a[i+2][j+2];
                   System.out.println(val);
                   if(val>max){
                       max=val;
                   }
               }
           }
           System.out.println(max);
}
}
