package algorithms.node;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Node {

    public int getNodes(int n, int[][] categories) {
        Map<Integer, List<Integer>> map = new HashMap<>();


        for (int i = 0; i < categories.length; i++) {
            int key = categories[i][0];
            for (int j = 1; j < categories[i].length; j++) {
                int temp = categories[i][j];

                if (map.containsKey(key)) {
                    List<Integer> list = new ArrayList<>();
                    list.addAll(map.get(key));
                    list.add(temp);
                    map.put(key, list);
                } else {
                    map.put(key, List.of(temp));
                }

            }
        }

        System.out.println(map);

        StringBuffer buffer = new StringBuffer();

        for (int i = 1; i <= n; i++) {
            if (!map.containsKey(i)) {
                buffer.append(i);
            }
        }

        return Integer.parseInt(buffer.toString());
    }
}
