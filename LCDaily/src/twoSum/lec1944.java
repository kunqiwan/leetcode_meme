package twoSum;

import java.util.Stack;

public class lec1944 {

    public int[] canSeePersonsCount(int[] heights) {
       // calculate the length
       int n = heights.length;
       int [] res = new int [n];
        Stack<Integer> s =new Stack<>();
        //the last position, which is n-1, is always 0
        s.push(n-1);
        //so we start from the n-2 position
        for (int i=n-2;i>=0;i--){
            //remove means the number smaller than the current number
            //if smaller than the current , it will remove , but we need to count these to the view number
            int remove = 0;
            while(!s.isEmpty() && heights[s.peek()] < heights[i]){
                s.pop();
                remove++;
            }
            //if the stack is empty, it means current is the biggest
            //it need to check the remove number
            //notice: although it is the tallest, it doesn't mean it can see all number, it will see the furthest one
            if (s.isEmpty()){
              res[i] = remove;
            } else {
                //if stack is not empty, it will see the remove plus the taller one
                res [i] = remove+1;
            }
            s.push(i);
        }
        return res;

    }
}
