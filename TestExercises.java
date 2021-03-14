import java.util.*;

public class TestExercises {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter some text: ");
        String text = scanner.nextLine();


    }

    public static String middleChar(String str) {
        int position;
        int length;

        if (str.length() % 2 == 0) {
            position = str.length() / 2 - 1;
            length = 2;
        } else {
            position = str.length() / 2;
            length = 1;
        }

        return str.substring(position, position + length);
    }

}
