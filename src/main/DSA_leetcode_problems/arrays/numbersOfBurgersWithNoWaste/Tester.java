package arrays.numbersOfBurgersWithNoWaste;

import java.util.ArrayList;
import java.util.List;

public class Tester {
    public static void main(String[] args) {
        int tomatoSlices = 16, cheeseSlices = 7;
        List<Integer> result = new ArrayList<>();
        result = Solution.numOfBurgers(tomatoSlices,cheeseSlices);
        for(Integer i : result){
            System.out.println(i);
        }
    }
}
