package twoSum;

public class lec326 {

        public boolean isPowerOfThree(int n) {
            return recursion(n);
        }
        public boolean recursion(int num){
            if(num == 1){
                return true;
            }
            if (num%3==0){
                num = num/3;
                return recursion(num);
            } else{
                return false;
            }
        }
}
