package twoSum;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class lec40 {

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
     List<List<Integer>> result = new LinkedList<>();
     LinkedList<Integer> path = new LinkedList<>();
     Arrays.sort(candidates);
     backtracking(0,candidates,target,result,path);
     return result;
    }
    public void backtracking(int startindex,int[] candidates,int target,List<List<Integer>> result,LinkedList<Integer> path){
       if(target ==0){
        result.add(new LinkedList<>(path));
        return;
       }
       if(target<0){
           return;
       }
       for(int i =startindex;i<candidates.length;i++){
           if(target<candidates[i]){
               break;
           }
           //for every new startindex, it means a new start of loop, and the first one is always the biggest set
           //so it means if the first on
           if(i>startindex && candidates[i]==candidates[i-1]){
               continue;
           }
           path.add(candidates[i]);
           backtracking(i+1,candidates,target-candidates[i],result,path);
           path.removeLast();
       }
    }


    public static void main(String[] args){
        int [] s = {1,1,1,1,1};
        lec40 t = new lec40();
        System.out.println("final answer:"+t.combinationSum2(s,5));

    }
}
