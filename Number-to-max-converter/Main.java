package algorithms.maxValueConverting;

import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Manipulate m = new Manipulate();
        List<Integer> list = m.getArr(8973853);
        Collections.sort(list, Collections.reverseOrder());
        StringBuffer s = new StringBuffer();

        list.stream().forEach(i -> s.append(i));
        int n = Integer.parseInt(s.toString());

        System.out.println(n);




    }
}
