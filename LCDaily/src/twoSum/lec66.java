package twoSum;

import java.util.ArrayList;
import java.util.List;

public class lec66 {
// method 1
//    public int[] plusOne(int[] digits) {
//    int n = digits.length;
//    int over =0;
//    List<Integer> values = new ArrayList<>();
//    for (int i = n-1;i>=0;i--){
//       int p =digits[i] +over;
//       if (i==n-1){
//           p = p+1;
//       }
//       over = 0;
//       if (p==10){
//           over = 1;
//           values.add(0, 0);
//           if (i==0){
//               values.add(0, 1);
//           }
//       } else {
//           values.add(0, p);
//       }
//    }
//        int[] array = new int[values.size()];
//        for (int i = 0; i < values.size(); i++) {
//            array[i] = values.get(i);
//        }
//    return array;
//    }
//method 2
public int[] plusOne(int[] digits) {
    int n = digits.length;
    for (int i =n-1;i>=0;i--){
        if(digits[i] == 9){
            digits[i] =0;
        } else {
            digits[i]++;
         return digits;
        }
    }
    digits = new int [digits.length+1];
    digits[0] = 1;
    return  digits;
}
}
