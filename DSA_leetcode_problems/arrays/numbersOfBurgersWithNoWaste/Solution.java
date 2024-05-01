package arrays.numbersOfBurgersWithNoWaste;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    //This is basically a math problem.
    //
    //Let's assume there are num_j of Jumbo and num_s of Small Burger. Based on the problem description.:
    //
    //tomatoSlices = num_j * 4 + num_s * 2     (1)
    //cheeseSlices = num_j + num_s             (2)
    //By (1) - 2 * (2), we can get,:
    //
    //num_j = (1 / 2) * tomatoSlices - cheeseSlices
    //By 4 * (2) - (1), we can get,:
    //
    //num_s = 2 * cheeseSlices - tomatoSlices / 2
    //Finally, we need to check if num_j, num_s are valid.
    // The solution is valid if and only if each is greater or equal than 0 and it is an integer.
    public static List<Integer> numOfBurgers(int tomatoSlices, int cheeseSlices){
        List<Integer> result = new ArrayList<>();
        Integer num_j = tomatoSlices/2 - cheeseSlices;
        Integer num_s = 2*cheeseSlices - tomatoSlices/2;
        if(num_j < 0 || num_s <0){
            return result;
        }
        if(num_j != Math.floor(num_j) || num_s != Math.floor(num_s)){
            return result;
        }
        result.add(num_j);
        result.add(num_s);
        return result;

    }

}
