import java.util.Arrays;
import java.util.Scanner;

public class TestExercises {

    static boolean isAnagram(String word, String anagram) {
        if (word.length() != anagram.length()) {
            return false;
        }

        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);

            int index = anagram.indexOf(c);

            if (index != -1) {
                anagram = anagram.substring(0, index) + anagram.substring(index+1, anagram.length());
            } else {
                return false;
            }
        }

        return anagram.isEmpty();
    }

    static String sortChars(String word) {
        char[] wordArr = word.toLowerCase().toCharArray();
        Arrays.sort(wordArr);
        return String.valueOf(wordArr);
    }

    static boolean isAnagram2(String word1, String word2) {
        String sortword1 = sortChars(word1);
        String sortword2 = sortChars(word2);

        return sortword1.equals(sortword2);
    }

    static int sumDigitOfNumber(int num) {
        int z = 0;

        if (num == 1000) {
            z = 1;
        } else if (num >= 100 && num <= 999) {
            z = (num % 10) + ((num / 10) % 10) +((num / 100));
        } else {
            z = (num % 10) + (num / 10);
        }
        return z;
    }

    public static void main(String[] args) {

        int[] numbers = new int[]{20, 30, 25, 35, -16, 60, -100};
        int[] myArr = new int[8];
        String[] arrStrings = {"Q", "W", "E", "C", "B", "A"};

        int num = 0;
        if (num > 1000 || num <= 0){
            System.out.println("Number must be between 0 and 1000");
        } else {
            System.out.println(sumDigitOfNumber(num));
        }
    }


}
