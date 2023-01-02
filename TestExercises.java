import java.util.*;

public class TestExercises<e> {

    public static void main(String[] args) {

        reverseNumber(123);

    }

    static void reverseNumber(int num) {
        int reverseNum = 0;
        int rightDigit;
        if (num == 0) {
            return ;
        }

        while (num > 0) {
            rightDigit = num % 10;
            reverseNum = reverseNum * 10 + rightDigit;
            num = num / 10;
        }

        System.out.println(reverseNum);
    }


}




