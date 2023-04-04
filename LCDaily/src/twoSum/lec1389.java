package twoSum;

import java.util.LinkedList;

public class lec1389 {
    public int[] createTargetArray(int[] nums, int[] index) {
        LinkedList<Integer> save = new LinkedList<>();
        for (int i =0;i<nums.length;i++){
            save.add(index[i], nums[i]);
        }
        int[] array = save.stream().mapToInt(Integer::intValue).toArray();
        return array;
    }
}
