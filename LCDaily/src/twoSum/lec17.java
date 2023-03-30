package twoSum;

import java.util.LinkedList;
import java.util.List;

public class lec17 {

    public List<String> letterCombinations(String digits) {
        String [] arr = new String[]{"","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        int [] nums = new  int[digits.length()];
        List<String> result = new LinkedList<>();
        LinkedList<Character> path = new LinkedList<>();
        if (digits.equals("")){
            return result;
        }
        backtracking(0,result,arr,new StringBuilder(),digits);
        return result;
    }
    public void backtracking(int index,List<String> result,String [] arr, StringBuilder letter,String digits){
     //due to we set index start with 0, so it will meet the required size when it up to index +1 when equal to length
     //for instance,if we have "23", length is 2 ,index start with 0,so when it traverse 3 ,index is 1,it plus 1 to return
    if(index == digits.length()){
        result.add(letter.toString());
        return;
    }
    char c = digits.charAt(index);
    int pos =c-'1';
    String phone = arr[pos];
    for(int i =0;i<phone.length();i++){
    letter.append(phone.charAt(i));
    //image when call this function, it will go to next layer loop
    backtracking(index+1,result,arr,letter,digits);
    letter.deleteCharAt(letter.length()-1);
    }

    }


}
