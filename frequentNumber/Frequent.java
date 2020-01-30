package algorithms.frequentNumber;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Frequent {

    //{1,2,8,6,3,9,2,4,2}
    public List<Integer> getFrequent(int[] arr){
        List<Integer> list = new ArrayList<>();
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            if (set.contains(arr[i])){
                if (!list.contains(arr[i])){
                    list.add(arr[i]);
                }
            }else {
                set.add(arr[i]);
            }
        }

        return list;
    }
}
