package twopointer;
class Solution {
    public static void main(String[] args){

        System.out.println("Hello, World!");

    }
    public boolean isPalindrome(String s) {
        StringBuffer sb = new StringBuffer();
        for (int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if (Character.isLetterOrDigit(c)){
                sb.append(Character.toLowerCase(c));
            }
        }
        int left =0;
        int right =sb.length()-1;
        char [] charArray = sb.toString().toCharArray();
        System.out.println(charArray);
        while (left <=right){
            if(charArray[left] !=charArray[right]){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}