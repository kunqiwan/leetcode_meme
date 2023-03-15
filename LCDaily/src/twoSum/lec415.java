package twoSum;

public class lec415 {

    public String addStrings(String num1, String num2) {
       StringBuilder res = new StringBuilder();
       int i = num1.length()-1;
       int j = num2.length()-1;
       int add =0;
       while (i>=0 || j >=0){
           // iterate the first number from the end to start
           //if i<0, it means it iterate over and we need to give it a zero
           int first = i>=0? num1.charAt(i)-'0':0;
           // iterate the second number from the end to start
           int second = j>=0 ? num2.charAt(j)-'0':0;
           //add the number of the digit we iterate,then may add the 1 from the sum of last digit
           int result = first+second+add ;
           //if result over 10, we need to keep 1 here
           if (result>=10){
               add =1;
           } else {
               add =0;
           }
           // due to we are decimal, we need to turn 10 to 1, <10 keep it
           res.append(result%10);
           i--;
           j--;
       }
       //special condition:we iterate every digit,if it is more than 10, we still need to add 1
       if(add==1) {
           res.append(1);
        }
       // we put them from start to end, then we need to reverse them
       res.reverse();
    return res.toString();
    }
}
