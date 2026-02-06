package strings.string.ListProblem;

import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class Sol1 {
    public static int minimumCost(List<Integer> arr) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(arr);

        int totalCost = 0;
        while (pq.size() > 1) {
            int cost = pq.poll() + pq.poll();
            totalCost += cost;
            pq.add(cost);
        }

        return totalCost;
    }

    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(25, 10, 20);
        System.out.println(minimumCost(arr));  // Output: 85
    }

}
