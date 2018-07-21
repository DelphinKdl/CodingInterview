import java.util.Hashtable;
import java.util.List;
public class Duplicates {
    public static void main (String [] args) {
        Hashtable<Integer,List<Integer>>myTable= new Hashtable<Integer,List<Integer>>();

        int [] items = {4,1,2,1,2};
        int length = items.length; 
        for (int i = 0 ;i<length; i++)
        myTable.put(i, List.add(new Integer(items[i])));
        System.out.println(myTable.get(1));
    }
}