package AssociativeArrays;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class CountCharsInString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        //Keep the sequential order of inserting using link hash map
        LinkedHashMap<Character, Integer> charByOccurances = new LinkedHashMap<>();


        for (int i = 0; i < text.length(); i++) {
            char symbol1 = text.charAt(i);

            if (symbol1 != ' ') {
                if (!charByOccurances.containsKey(symbol1)) {
                    charByOccurances.put(symbol1, 1);
                } else {
                    charByOccurances.put(symbol1, charByOccurances.get(symbol1) + 1);
                }
            }
        }

        for (Character characterLetter : charByOccurances.keySet()) {
            System.out.println(String.format("%c -> %d", characterLetter, charByOccurances.get(characterLetter)));
        }
    }
}
