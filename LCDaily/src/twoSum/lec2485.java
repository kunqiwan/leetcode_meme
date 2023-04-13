package twoSum;

public class lec2485 {
    public int pivotInteger(int n) {
    int left =1;
    int right = n;
    int sum_left =1;
    int sum_right =right;
    while(left!=right){

    if(sum_left >= sum_right){
        right--;
        sum_right = sum_right+right;
    } else{
        left++;
        sum_left = sum_left+left;
    }
    }
    if (sum_left == sum_right){
        return left;
    } else {
        return -1;

    }
    }
}
