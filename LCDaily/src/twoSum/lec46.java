package twoSum;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class lec46 {

//create result to store each result of path
List<List<Integer>> result = new LinkedList<>();
//store one possible permutation
LinkedList<Integer> path = new LinkedList<>();
//to determine this number has been traversed or not
boolean [] used;

//main function to execute recursion
public List<List<Integer>> permute(int[] nums) {
if (nums.length == 0){
    return result;
}
    used = new boolean[nums.length];
 backtracking(nums);
    return result;
}

    //back tracking
void backtracking (int[] nums){
if (path.size() ==nums.length ){
    result.add(new LinkedList<>(path));
return;
}
//single structure logistic
for (int i=0;i<nums.length;i++){
    if(used[i]){
        continue;
    }
    path.add(nums[i]);
    used[i] = true;
    backtracking(nums);
    used[i] = false;
    path.removeLast();

}


}
}
