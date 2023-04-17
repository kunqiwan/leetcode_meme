package twoSum;

public class lec1816 {

    public static String truncateSentence(String s, int k) {
//        String[] strArray = s.split(" ");
//        int count =0;
//        StringBuilder res =  new StringBuilder();
//        for(int i=0;i<strArray.length;i++){
//            System.out.println(strArray[i]);
//            res.append(strArray[i]);
//            res.append(" ");
//            if(i==k-1){
//            break;
//            }
//        }
//        res.deleteCharAt(res.length() - 1);
//        return res.toString();
    }

    public static void main(String[] args){
        String s = "Hello how are you Contestant";
        int k=4;
        System.out.println(truncateSentence(s,k));
    }
}
