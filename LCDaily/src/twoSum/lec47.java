package twoSum;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class lec47 {
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new LinkedList<>();
        LinkedList<Integer> path = new LinkedList<>();
        boolean [] used = new boolean [nums.length];
        backtracking(path,result,nums,used);
        return result;
    }
    public void backtracking(LinkedList<Integer> path,List<List<Integer>> result,int[] nums,boolean [] used){
    if(path.size() == nums.length){
//        if (!result.contains(path)){
//
//        }
        result.add(new LinkedList<>(path));
    return;
    }
    for (int i=0;i<nums.length;i++){
    if(used[i]){
        continue;
    }
    if(i>0&&nums[i]==nums[i-1]&& !used[i - 1]){
    continue;
    }
    path.add(nums[i]);
    used[i] = true;
//        System.out.println("before:"+path);
    backtracking(path,result,nums,used);
    used[i] = false;
    path.removeLast();
//        System.out.println("after:"+path);
    }

    }
    public static void main(String[] args){
        int [] nums = {1,2,3};
        lec47 t = new lec47();
//        System.out.println("final answer:"+t.permuteUnique(nums));
    }
}
