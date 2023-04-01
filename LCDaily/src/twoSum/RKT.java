package twoSum;

import java.util.HashMap;

public class RKT {
        static int MODULO = 1000000007;
        static int MAX_LENGTH = 30;
        static HashMap<Integer, Long> factorials = new HashMap<Integer, Long>();

        // Function to precompute factorials up to MAX_LENGTH
        static void precomputeFactorials() {
            long answer = 1;
            for (int i = 1; i <= MAX_LENGTH; i++) {
                answer = (answer * i) % MODULO;
                factorials.put(i, answer);
            }
            System.out.println("factorials" + factorials);
        }

        // Function to check whether the current character is a vowel or not
        static boolean isVowel(char character) {
            return character == 'A' || character == 'E' || character == 'I' || character == 'O' || character == 'U';
        }

        // Function to count the number of anagrams of S satisfying the given condition
        public  int solution(String s) {
            int length =s.length();
            // Precompute factorials up to MAX_LENGTH
            precomputeFactorials();

            // Create a hashmap to store frequencies of all characters
            HashMap<Character, Integer> characterFrequency = new HashMap<>();

            // Store the count of vowels and consonants
            int vowelCount = 0;
            int consonantCount = 0;

            // Iterate through all characters in the string
            for (int i = 0; i < length; i++) {
                // Update the frequency of current character
                if (characterFrequency.containsKey(s.charAt(i))) {
                    characterFrequency.put(s.charAt(i), characterFrequency.get(s.charAt(i)) + 1);
                } else {
                    characterFrequency.put(s.charAt(i), 1);
                }

                // Check if the character is vowel or consonant
                if (isVowel(s.charAt(i))) {
                    vowelCount++;
                } else {
                    consonantCount++;
                }
            }

            if (consonantCount == vowelCount + 1 || consonantCount == vowelCount) {
                // Store the denominator of the expression
                long denominator = 1;

                // Calculate the denominator of the expression
                for (var item : characterFrequency.entrySet()) {
                    // Multiply denominator by factorial of counts of all letters
                    denominator = (denominator * factorials.get(item.getValue())) % MODULO;
                }

                // Store the numerator
                long numerator = factorials.get(consonantCount) % MODULO;
                numerator = (numerator * factorials.get(vowelCount)) % MODULO;

                // Store the answer by dividing numerator by denominator
                long answer = numerator / denominator;

                // Print the answer
                return (int)answer;
            } else {
                return 0;
            }
        }
    public static void main(String[] args)
    {
//        String S = "GADO";
//        RKT a =new RKT();
//        a.solution(S);
    }
}










