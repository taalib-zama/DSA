package backlog.dsa_udemy;
import java.util.Arrays;
import java.util.Comparator;
public class test {



        public static int[] largestLand(int[][] houses) {
            // Sort the houses based on their positions
            Arrays.sort(houses, Comparator.comparingInt(a -> a[1]));

            int maxDiff = -1;
            int[] result = new int[2];

            for (int i = 1; i < houses.length; i++) {
                int diff = houses[i][1] - houses[i - 1][1];
                if (diff > maxDiff) {
                    maxDiff = diff;
                    result[0] = houses[i - 1][0];
                    result[1] = houses[i][0];
                }
            }

            return result;
        }


    }

