package ArraysExercises;

import java.util.Scanner;

public class ArrayElementOccurrence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }
        System.out.println("Enter searching number: ");
        int searchElement = scanner.nextInt();

        System.out.println(getNumberOccurrence(numbers, searchElement));
    }

    public static int getNumberOccurrence(int[] numbers, int searchElement) {
        int occurrenceNum = 0;

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] == searchElement) {
                occurrenceNum++;
            }
        }
        return occurrenceNum;
    }
}
