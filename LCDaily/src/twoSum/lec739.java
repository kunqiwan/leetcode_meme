package twoSum;

import java.util.Stack;

public class lec739 {

    public int[] dailyTemperatures(int[] temperatures) {
        int[] res = new int[temperatures.length];
        int n = temperatures.length;
        Stack<Integer> s= new Stack<>();
        for (int i=n-1;i>=0;i--){
          while(!s.isEmpty() && temperatures[s.peek()] <=temperatures[i]){
              s.pop();
          }
          res[i] =s.isEmpty() ? 0:(s.peek()-i);
          s.push(i);
        }
        return res;
    }
}
