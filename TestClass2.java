import java.util.ArrayList;

public class TestClass2 {
    public static void main(String[] args) {

        int[] arr = {1, 3, 2, 5, 0, 1, 0, 1, 4, 5};
        int[] arr2 = {1, 2, 3, 2, 2, 1, 0, 1, 0, 1};

        printPerfectNum(6);

    }
    
    static void printPerfectNum(int num) {
        int divSum = 0;

        for (int i = 1; i < num / 2; i++) {
            if (num % i == 0) {
                divSum+=i;
            }
        }

        if (divSum == num) {
            System.out.println("Number is perfect - " + num);
        } else {
            System.out.println("Number is not perfect - " + num);
        }
    }


    

}
