package algorithms.maxValueConverting;

import java.util.ArrayList;
import java.util.List;

public class Manipulate {
    public List<Integer> getArr(int n){
        List<Integer> arr= new ArrayList<>();
        while (n%10>0){
            arr.add(n%10);
            n=n/10;
        }

        return arr;
    }


}
