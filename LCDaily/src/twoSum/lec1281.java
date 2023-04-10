package twoSum;

public class lec1281 {

    public int subtractProductAndSum(int n) {
    int ad =0;
    int multi = 1;
    while (n>0){
        int current = n%10;
        ad = ad +current;
        multi = multi * current;
        n = n/10;
    }
    return multi-ad;
    }
}
