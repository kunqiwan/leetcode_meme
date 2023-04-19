package twoSum;

import java.util.ArrayList;
import java.util.List;

public class lec728 {

    public static List<Integer> selfDividingNumbers(int left, int right) {
        ArrayList<Integer> result =new ArrayList<>();
        while(left <=right){
            int current = left;
            int digit = left%10;
            int s_num = 0;
            while(current !=0){
                if (digit==0){
                    s_num =1;
                    break;
                }
                if(left%digit ==0){

                } else{
                    s_num =1;
                    break;
                }
                current =current/10;
                digit = current%10;
            }
            if(s_num ==0){
                result.add(left);
            }
            left++;
        }
        return result;
    }

    public static void main(String[] args){
        int left = 47;
        int right = 85;
        System.out.println(selfDividingNumbers(left,right));



    }
}
