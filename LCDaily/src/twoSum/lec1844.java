package twoSum;

public class lec1844 {
    public String replaceDigits(String s) {
    StringBuilder result = new StringBuilder();
    for(int i=0;i<s.length();i++){
        char current = s.charAt(i);
        if(i%2!=0){
            int a =(int)s.charAt(i-1);
            int b=a+((int)s.charAt(i) - (int)'0');
            current = (char)b;
        }
        result = result.append(current);
    }
    String s_result = result.toString();

    return s_result;
    }
}
