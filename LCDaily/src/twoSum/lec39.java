package twoSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class lec39 {

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
      List<List<Integer>> result = new LinkedList<>();
        LinkedList<Integer> path = new LinkedList<>();
      backtracking(0,candidates,target,result,path);
      return result;
    }
    public void backtracking (int startindex,int[] candidates,int target,List<List<Integer>> result,LinkedList<Integer> path){
    if(target <0){
        return;
    }
    if(target ==0){
        result.add(new LinkedList<>(path));
        return;
    }
    for (int i=startindex;i<candidates.length;i++){
    path.add(candidates[i]);
    backtracking(i,candidates,target-candidates[i],result,path);
    path.removeLast();
    }
    }
}
