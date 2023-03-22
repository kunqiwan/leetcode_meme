package twoSum;

import java.util.Stack;

public class lec1475 {

    public int[] finalPrices(int[] prices) {
        int n = prices.length;
        int[] res = new int[n];
        Stack<Integer> s= new Stack<>();
        for (int i= n-1;i>=0;i--){
            while (!s.isEmpty() && prices[i] < s.peek()){
                s.pop();
            }
            res[i] = s.isEmpty()? prices[i]:prices[i]-s.peek();
            s.push(prices[i]);
        }
        return res;
    }
}
