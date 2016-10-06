import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by Pranith on 10/5/16.
 */
public class Arrays {

    public void findDuplicate(int[] arr){
        int i;

        Set<Integer> set=new HashSet<>();

        for(i=0;i<arr.length;i++){

            if(arr[Math.abs(arr[i])] > 0)
                arr[Math.abs(arr[i])] = -arr[Math.abs(arr[i])];

            else{

                set.add(Math.abs(arr[i]));
            }
        }
        System.out.println(set);
    }

    public static void main(String[] args){
        Arrays arrays=new Arrays();

        int[] array={4,2,4,2,1,2,4,5,6,5,5,5,5};

        arrays.findDuplicate(array);
    }
}
