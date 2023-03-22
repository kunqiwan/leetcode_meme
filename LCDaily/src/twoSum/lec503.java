package twoSum;

import java.util.Stack;

public class lec503 {

    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int [] res = new int[n] ;
        Stack<Integer> s= new Stack<Integer>();
        //if we want to find the element in one linear array ,it is a ring structure,double the size of the old one
        // use mod to do this, the double length will not affect the value on old position(one length)
        //after the end of old array, the first element of old array will continue
        //n =5, 3%5 =3, 8%5 =3
        for (int i =2*n-1;i>=0;i--){
            while(!s.isEmpty() && s.peek()<=nums[i%n]){
                s.pop();
            }
            res [i%n] = s.isEmpty()? -1:s.peek();
            s.push(nums[i%n]);
         }
    return res;
    }
}
