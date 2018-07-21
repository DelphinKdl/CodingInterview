public class removeDuplicates{
    public static int isExist(int num, int [] arr, int left, int right){
        if (left > right ){
            return -1;
        }

        int mid = (left + right)/2 ; 
       if (arr[mid] == num){
           return mid; 
       }
       else if (num < arr[mid]){
           return isExist(num,arr, left, mid-1);
       } else {
        return isExist(num,arr, mid+1, right);
       }
    } 
    public int removeDuplicates(int arr[], int n)
    {
        if (n==0 || n==1)
            return n;
     
        // To store index of next unique element
        int j = 0;
     
        // Doing same as done in Method 1
        // Just maintaining another updated index i.e. j
        for (int i=0; i < n-1; i++)
            if (arr[i] != arr[i+1]) {
                arr[j++] = arr[i];
                
            }
                
     
        arr[j++] = arr[n-1];
     
        return j;
    }
    public int clearDuplicates(int [] arr){
    int length = arr.length ; 
    int j = removeDuplicates(arr, length);
    return j ; 
    }
    public static void main(String [] args){
        int [] arr = {1,2,3,4,4,5,6,7,7,7,77,7,};
    
        // This Array is sorted and has duplicated ints.
        // REmove Dulplicates.
        // It should be in place. 
        removeDuplicates s  = new removeDuplicates();
        int size = s.clearDuplicates(arr);
        System.out.println(size);
    }
} 