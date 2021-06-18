import java.util.*;

class RotateArray{
    void leftRotate(int arr[], int d, int n) {
        for (int i = 0; i < d; i++) {
            leftRotateByOne(arr, n);
        }
    }

    void leftRotateByOne(int arr[], int n) {
        int temp;
        temp = arr[0];
        for (int i = 0; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[n - 1] = temp;
    }

    void printArray(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i] + " ");
        }
    }
}

public class TestExercises {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr1 = {6,5,4,3,2,1,0};

        RotateArray rotateArray = new RotateArray();

        rotateArray.leftRotate(arr1, 2, 6);
        rotateArray.printArray(arr1, 7);

    }




}
