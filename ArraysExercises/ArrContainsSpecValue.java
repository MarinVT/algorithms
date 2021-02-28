package ArraysExercises;

public class ArrContainsSpecValue {
    public static void main(String[] args) {
        //Test if an array contains a specific value

        int[] myArr = {1,2,3,4,5,6,8};
        System.out.println("Search for: " + containsSpecValue(myArr, 1));
    }

    public static boolean containsSpecValue(int[] arr, int searchItem) {
        for (int i : arr) {
            if (searchItem == i) {
                return true;
            }
        }
        return false;
    }
}
