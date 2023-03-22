package twoSum;

public class INGTest {

    public static void main(String[] args) {
//        ArrayList<String> res = new ArrayList<>();
//        res.add ("two");
        int x=7;
        int y=42;
        int[] arr = new int[]{7,7};
        System.out.println("final answer:"+solution(x,y,arr));
//        int[] arr = new int[5];
//        Set<String> set = new HashSet<>();
//        Map<String, Integer> map = new HashMap<>();
//    }

    }

        public static int solution(int X, int Y, int[] A) {
            int N = A.length;
            int result = -1;
            int nX = 0;
            int nY = 0;
            for (int i = 0; i < N; i++) {
                if (A[i] == X)
                    nX += 1;
                else if (A[i] == Y)
                    nY += 1;
                if (nX == nY )
                    result = i;
            }
            return result;
        }


}
