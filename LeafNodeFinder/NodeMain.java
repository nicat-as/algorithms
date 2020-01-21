package algorithms.node;

import java.util.Arrays;

public class NodeMain {
    public static void main(String[] args) {
        Node node = new Node();
        int[][] c = {{1, 2}, {1, 3}, {2, 3}, {2, 4}, {2, 5}};
        for (int i = 0; i < c.length; i++) {
            System.out.println(Arrays.toString(c[i]));
        }
        System.out.println(node.getNodes(5, c));
    }
}
