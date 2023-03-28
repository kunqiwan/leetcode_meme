package twoSum;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class lec77 {
    //create result to store each result of path
    static List<List<Integer>> result = new LinkedList<>();
    //store one possible permutation
    static LinkedList<Integer> path = new LinkedList<>();
    //to determine this number has been traversed or not
    public List<List<Integer>> combine(int n,    int k) {
        if (n == 0 || k==0){
            return result;
        }
        backtracking(1,n,k);
        return result;
    }

    public void backtracking (int startindex,int n,int k){
        System.out.println("current startindex:"+startindex);
        if(path.size() == k){
            result.add(new LinkedList<>(path));
            return;
        }
        for (int i=startindex;i<=n;i++){
            path.add(i);
            System.out.println("before recursion"+path);
            backtracking(i+1,n,k);
            path.removeLast();
            System.out.println("after recursion"+path);
            //i will add 1 here
            //so we suppose k=2, when list is[1,2],bt(3,4,2)will return
            //then it will change to [1] after remove, and i+1. which is 2+1 from the bt(n,k,2)
        }
    }
    public static void main(String[] args){
        int [] s = {1,2,3,4};
        lec77 t = new lec77();
        System.out.println("final answer:"+t.combine(4,2));
    }
}
