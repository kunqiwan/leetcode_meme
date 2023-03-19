package twoSum;

import java.util.HashMap;
import java.util.Stack;

public class lec496 {

    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
    int[] res = new int[nums1.length];
    int n = nums2.length;
    int [] greater = new int[n];
        HashMap<Integer,Integer> numsTwoMap = new HashMap<Integer,Integer>();
        Stack<Integer> s= new Stack<>();
        for (int i=n-1;i>=0;i--){
            while(!s.isEmpty()&& s.peek()<=nums2[i]){
                    s.pop();
            }
        if (s.isEmpty()){
            numsTwoMap.put(nums2[i],-1);
            } else{
            numsTwoMap.put(nums2[i],s.peek());
        }
            s.push(nums2[i]);
        }
        for (int m=0;m< nums1.length;m++){
            res[m]=numsTwoMap.get(nums1[m]);
        }
        return res;
    }
}
