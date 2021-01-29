package ArraysExercises;

public class DuplicateElementsArr {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,4,5,6,7,7,8};

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[j]);
                }
            }
        }


    }
}
