package twoSum;

public class lec1323 {
    public int maximum69Number (int num) {
        String tem = Integer.toString(num);
        StringBuilder sb = new StringBuilder(tem);
        for (int i=0;i<tem.length();i++){
            if ((int)tem.charAt(i) == 6){
                sb.setCharAt(i,'9');
                int number = Integer.parseInt(sb.toString());
                return number;
            }

        }
        return num;
    }
}
