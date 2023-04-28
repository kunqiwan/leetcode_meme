package twoSum;

public class lec2185 {
//method 1 - traverse
//    public int prefixCount(String[] words, String pref) {
//        int len = pref.length();
//        int count =0;
//        for(int n=0;n<words.length;n++){
//            String current = words[n];
//            int align =0;
//            if(current.length()<len){
//                continue;
//            }
//            for(int m=0;m<len;m++){
//                if(current.charAt(m)!=pref.charAt(m)){
//                    align = 1;
//                    break;
//                }
//            }
//            if(align==0){
//            count++;
//            }
//        }
//        return  count;
//    }
//method 2 -subarray
    public int prefixCount(String[] words, String pref) {
        int pl=pref.length(),count=0,l=0; //pl is prefix length

        for(String y:words){
            l=Math.min(pl,y.length());  //comparing identify the smallest length
            y=y.substring(0,l);
            System.out.println(y);
            if(y.equals(pref))
                count++;
        }
        return count;



    }
}
