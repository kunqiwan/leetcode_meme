package twoSum;

public class xinde {
    public void main(String[] args){
        int [] s = {1,1,100,4};

        String S ="AABB";
        System.out.println(solution(S));

    }
        private final int MOD = 1000000007;
        private int[] freq;

        public int solution(String s) {
            freq = new int[26];
            for (char c : s.toCharArray()) {
                freq[c - 'A']++;
            }
            return countWellStructuredWords("");
        }

        private int countWellStructuredWords(String word) {
            int count = 0;
            int len = word.length();
            if (len > 0) {
                char last = word.charAt(len - 1);
                if (isVowel(last)) {
                    return 0;
                }
                if (len > 1) {
                    char secondLast = word.charAt(len - 2);
                    if (isVowel(last) && isVowel(secondLast)) {
                        return 0;
                    }
                    if (!isVowel(last) && !isVowel(secondLast)) {
                        return 0;
                    }
                }
            }
            if (word.length() == freq.length) {
                return 1;
            }
            for (int i = 0; i < freq.length; i++) {
                if (freq[i] > 0) {
                    freq[i]--;
                    count = (count + countWellStructuredWords(word + (char)('A' + i))) % MOD;
                    freq[i]++;
                }
            }
            return count;
        }

        private boolean isVowel(char c) {
            return c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
        }


}

