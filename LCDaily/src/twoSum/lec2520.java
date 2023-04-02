package twoSum;

public class lec2520 {
    public int countDigits(int num) {
        int count =0;
        int copy =num;
        while (copy >0){
           int current = copy %10;
           if (num % current==0){
               count++;
           }
            copy = copy/10;
        }
    return count;
    }
    public static void main(String[] args){
        int s =1258;
        //Solution.solution(s)
        System.out.println(1258/10);

    }
}
