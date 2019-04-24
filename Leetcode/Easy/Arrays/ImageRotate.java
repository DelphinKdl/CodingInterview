public class ImageRotate {
  public static void swapingDiagonally(int [] [] matrix){
    int row = 0 ;
    int col = 0 ;
    int len = matrix.length -1 ;

    for (int i =1;i<;length ;i++ ){
      int temp = matrix[row][col+1];
      matrix[row][col+1] = matrix[row+1][col];
      
    }
  }
  public static void main (String [] args){
    int [][] matrix =  {{1,2,3},
                        {4,5,6},
                        {7,8,9}
    };
    ImageRotate.swapingDiagonally(matrix);

}
}
