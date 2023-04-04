package twoSum;

public class lec709 {

    public String toLowerCase(String s) {
        StringBuilder result = new StringBuilder();
        for(int i=0;i<s.length();i++){
            char current = s.charAt(i);

            if(current<65 ||current >=91 && current <=96 ||current>=123){

            }  else if (current <97){
                current = (char) (current+32);
            }
           result.append(current);
        }
        String str = result.toString();
        return str;
    }
}
