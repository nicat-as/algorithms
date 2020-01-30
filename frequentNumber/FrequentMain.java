package algorithms.frequentNumber;

public class FrequentMain {
    public static void main(String[] args) {
        Frequent frequent = new Frequent();

        int[] arr = {1,2,8,6,3,9,2,3,4,2};

        System.out.println(frequent.getFrequent(arr));
    }
}
