package twoSum;

public class lec2108 {
    public String firstPalindrome(String[] words) {
    for(int n=0;n< words.length;n++){
        int is_pal = 1;
        String current= words[n];
        int left =0;
        int right = current.length()-1;
        while(left<right){
            if(current.charAt(left) !=current.charAt(right)){
                is_pal = 0;
                break;
            }
            left++;
            right--;
        }
        if(is_pal ==1){
            return current;

        }
    }
    return "";
    }
}
