package twoSum;

public class lec2427 {
    public int commonFactors(int a, int b) {
        int min ;
        int max;
    if (a>b){
        min = b;
        max =a;
    } else {
        min  =a;
        max =b;
    }
    int i=1;
    int count =0;
    while(i<=min){
    if(max%i==0 && min%i==0){
        count++;
    }
    i++;
    }
return count;
    }
}
