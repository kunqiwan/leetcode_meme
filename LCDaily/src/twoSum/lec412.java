package twoSum;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class lec412 {

    public static void main(String[] args){
        ArrayList<String> res = new ArrayList<>();
        res.add ("two");
        System.out.println(res);

    }


  public List<String> fizzBuzz(int n) {
      ArrayList<String> res = new ArrayList<>();
      for (int i=1;i<n;i++){
          if (i%3==0&& i%5==0){
              res.add("FizzBuzz");
          } else if (i%3==0){
              res.add("Fizz");
          } else if (i%5==0){
              res.add("Buzz");
          } else {
              res.add(Integer. toString(i));
          }
      }
      return res;

    }

}
