package twoSum;

public class lec1528 {
    public String restoreString(String s, int[] indices) {
    int n =s.length();
    Character [] result =new Character[n];
    for (int i=0;i<n;i++){
    char c =s.charAt(i);
    result[indices[i]] = c;
    }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(result[i]);
        }
        String str = sb.toString();
    return str;
    }
}
