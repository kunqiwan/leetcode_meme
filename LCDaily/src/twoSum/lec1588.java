package twoSum;

public class lec1588 {
    public int sumOddLengthSubarrays(int[] arr) {
        int n= arr.length;
        int prefix_sum [] =new int[n+1];
        int sum =0;
        int result =0;
        //create prefix_sum array,when i=0, the sum before 0 is 0, so the array size should be n+1
        for(int i=1;i<n+1;i++){
            prefix_sum[i] = prefix_sum[i-1]+arr[i-1];
        }
        // m control the position of given array
        //end could protect that every times it jump to the posistion of odd pos
        for(int m=0;m<n;m++){
            for(int end=1;end+m<=n;end =end+2){
                //end start with 1 because it control the position of pre_fix array
                //when m>0,the start point of m should not cover the sum before m,so need to minus here
                result=result+prefix_sum[end+m]-prefix_sum[m];
            }

        }
        return result;
    }
}
