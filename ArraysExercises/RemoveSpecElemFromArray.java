package ArraysExercises;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveSpecElemFromArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[] myArr = {1,2,3,4,5};

        System.out.println("print original arr: " + Arrays.toString(myArr));
        System.out.println("New arr: " + Arrays.toString(removeElement(myArr, 2)));
    }

    public static int[] removeElement(int[] oldArr, int place){

        int[] newArr = new int[oldArr.length - 1];
        int j = 0;

        for (int i = 0; i < oldArr.length; i++) {
            if (i == place-1) {
                continue;
            }
            newArr[j] = oldArr[i];
            j++;
        }
        return newArr;
    }
}
