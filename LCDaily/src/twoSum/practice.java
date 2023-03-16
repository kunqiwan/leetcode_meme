package twoSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

//Write a function:
//
//class Solution { public int solution(int[] A); }
//
//that, given an array A of N integers, returns the smallest positive integer (greater than 0) that does not occur in A.
//
//For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.
//
//Given A = [1, 2, 3], the function should return 4.
//
//Given A = [−1, −3], the function should return 1.
//
//Write an efficient algorithm for the following assumptions:
//
//N is an integer within the range [1..100,000];
//each element of array A is an integer within the range [−1,000,000..1,000,000].
public class practice {

    public static void main(String[] args){
        int [] s = {1,1,100,4};
        //Solution.solution(s)
        System.out.println();

    }

    static class Solution {
//        public static int solution(int[] A) {
//            int N = A.length;
//            System.out.println("N"+N);
//            // start from 1, a size 4 array the maximum is 4,so the seen array size should be 5, we jump 0
//            boolean[] seen = new boolean[N+1];
//            System.out.println(seen.length);
//            System.out.println("show:"+seen[3]);
//            for (int i = 0; i < N; i++) {
//                if (A[i] > 0 && A[i] <=N) {
//                    seen[A[i]] = true;
//                }
//                System.out.println("i"+i);
//            }
//
//            for (int i = 1; i <N; i++) {
//                if (!seen[i]) {
//                    return i;
//                }
//            }
//
//            return N;
//        }

        public int solution(int[] A) {
            // Implement your solution here
            Arrays.sort(A);
            int min = A[0];
            int max = A[A.length-1];
            if (max < 0){
                return 1;
            }
            // the max number in array
            int size = A.length;
            for (int i=0;i<size;i++){
                boolean containsX = false;
                for (int m = 0; m < A.length; m++) {
                    if (A[m] == i) {
                        containsX = true;
                        break;
                    }
                }
                if (!containsX) {
                    return i;
                }
            }
            return size+1;
        }
    }
}
