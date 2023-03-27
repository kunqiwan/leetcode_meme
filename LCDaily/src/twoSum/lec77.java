package twoSum;

import java.util.LinkedList;
import java.util.List;

public class lec77 {
    //create result to store each result of path
    List<List<Integer>> result = new LinkedList<>();
    //store one possible permutation
    LinkedList<Integer> path = new LinkedList<>();
    //to determine this number has been traversed or not
    public List<List<Integer>> combine(int n, int k) {
        if (n == 0 || k==0){
            return result;
        }
        backtracking(1,n,k);
        return result;
    }

    void backtracking (int startindex,int n,int k){
        if(path.size() == k){
            result.add(new LinkedList<>(path));
            return;
        }
        for (int i=startindex;i<=n;i++){
            path.add(i);
            backtracking(i+1,n,k);
            path.removeLast();
        }
    }
}
