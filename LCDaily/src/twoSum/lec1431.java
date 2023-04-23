package twoSum;

import java.util.LinkedList;
import java.util.List;

public class lec1431 {

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
    int max =0;
        LinkedList<Boolean> res = new LinkedList<>();
        int biggest =0;
        for(int n=0;n<candies.length;n++){
            if(candies[n]>biggest){
                biggest =candies[n];

            }
        }
        for (int candy : candies) {
            if (candy + extraCandies >= biggest) {
                max = candy + extraCandies;
                res.add(true);
            } else {
                res.add(false);
            }

        }
    return res;
    }
}
