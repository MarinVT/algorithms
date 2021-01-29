package PracticeLessons;

public class ReverseString {
    public static void main(String[] args) {

        String str2 = reverseStr("marin");
        System.out.println(str2);
    }

    public static String reverseStr(String str1) {
        char[] letters = new char[str1.length()];

        int lettersIndex = 0;

        for (int i = str1.length() - 1; i >= 0; i--) {
            letters[lettersIndex] = str1.charAt(i);
            lettersIndex++;
        }

        String rev = "";
        for (int i = 0; i < str1.length(); i++) {
            rev += letters[i];
        }
        return rev;

    }
}
