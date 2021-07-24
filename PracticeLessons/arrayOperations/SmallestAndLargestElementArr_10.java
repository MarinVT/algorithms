package PracticeLessons.arrayOperations;

import java.util.Arrays;

public class SmallestAndLargestElementArr_10 {

    public static void largestOrSmallest(int[] myArr) {
        int largest = myArr[0];
        int smallest = myArr[0];

        for (int i = 1; i < myArr.length; i++) {
            if (myArr[i] > largest) {
                largest = myArr[i];
            } else if (myArr[i] < smallest) {
                smallest = myArr[i];

            }
        }
        System.out.println("The largest is: " + largest);
        System.out.println("The smallest is:     " + smallest);
   }

    // Approach 2
    public static void largestSmallest2(int[] numbers) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for (int number : numbers) {
            if (number > largest) {
                largest = number;
            } else if (number < smallest) {
                smallest = number;
            }
        }
        System.out.println("My array is: " + Arrays.toString(numbers));
        System.out.println("Array's largest number is: " + largest);
        System.out.println("Array's smallest number is: " + smallest);
    }

    public static void main(String[] args) {
        int[] myArr = {1,2,3,4,5};
//        largestOrSmallest(myArr);
        largestSmallest2(myArr);

    }
}
